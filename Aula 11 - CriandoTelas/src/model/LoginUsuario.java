package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUsuario {
//Criar um método que retornara o objeto Usuário ou null
	
	public Usuario verificarLogin(String login,String senha) throws SQLException {
		
		///SQL para buscar usuario
		String SQL ="SELECT*FROM usuarios WHERE login =?";
		
		try(Connection conn =ConexaoDB.conectar();
			PreparedStatement stnt=conn.prepareStatement(SQL)){
			
			stnt.setString(1,login);
			ResultSet rs=stnt.executeQuery();
			
			//Verificar se a consulta retornou null
			
			if(!rs.next()) {
				return null;
			}
			String senhaDB= rs.getString("senha");
			if(senha.equals(senhaDB)) {
				//Instancia
				Usuario usuario = new Usuario(rs.getInt("id"),rs.getString("login"),rs.getString("nome"),rs.getString("senha"));
				return usuario;
				}else {
					return null;
				}

		}
			
	}
}
