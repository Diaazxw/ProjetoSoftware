package controller;
import java.awt.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class AlterarTelaController {

	public static  void mudarTela(ActionEvent Event,String TelaFXML , String Titulo){
		
		//Informe o caminho do arquivo FXML
		FXMLLoader loader =new FXMLLoader(AlterarTelaController.class.getResource(TelaFXML));
		//Carregar o arquivo FXML
		Parent root=loader.load();
		
		//Identificar mudança
		Stage stage =(Stage)((javafx.scene.Node)Event.getSource()).getScene().getWindow();
		
		//Definir uma nova cena para a tela
		Scene scene = new Scene(root);

		//Definir um título para a jenela
		stage.setTitle = (Titulo);
				
		//Atualizo a nova cena
		stage.setScene(scene);
		stage.show();
		
	}
	
}
