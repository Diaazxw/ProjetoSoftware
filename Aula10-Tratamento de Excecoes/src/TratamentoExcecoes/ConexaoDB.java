package TratamentoExcecoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoDB {

	public static void main(String[] args) {
		try {
			conectarBanco();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	public static void conectarBanco() throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/sistema";
		String usuario = "root";
		String senha = "";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão com o banco de dados estabelecida");
		
		String sql = "INSERT INTO usuario (NOME, EMAIL, SENHA) VALUES (?, ?, ?)";
		
		PreparedStatement consQuery = conexao.prepareStatement(sql);
		consQuery.setString(1, "Marcelina");
		consQuery.setString(1, "marcelina@gmail.com");
		consQuery.setString(1, "050525");
		
		//Executar o comando
		consQuery.execute();
		
		//Encerra a conexão
		consQuery.close();
		conexao.close();
		
	}
	
}
}
