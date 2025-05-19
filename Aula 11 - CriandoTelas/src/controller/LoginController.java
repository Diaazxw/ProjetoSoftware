package controller;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.LoginUsuario;
import model.Usuario;

public class LoginController {

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void onClick(ActionEvent event) throws SQLException {
    	String login = this.txtLogin.getText();
    	String senha = this.txtLogin.getText();
    	
    	LoginUsuario loginUsuario=new LoginUsuario();
    	Usuario usuario = loginUsuario.verificarLogin(login,senha);
    	
    	if (usuario==null) {
    		Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setTitle("Erro Login ");
			alerta.setHeaderText("Login ou senha incorretos ");
			alerta.setContentText("Verifique as credenciais e tente novamente");
			alerta.showAndWait();
    		
    	}else {
    		System.out.println("Acesso Liberado");
    	}
    }

    @FXML
    void onClickVoltar(ActionEvent event) {

    }

}
