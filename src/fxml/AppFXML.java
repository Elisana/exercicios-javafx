package fxml;



import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Carrega o arquivo CSS
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
		
		//carregando a interface gráfica
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(arquivoCSS);//vincula o arq. css a cena
		
		primaryStage.setResizable(false); //não deixa alterar o tamanho da tela
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
