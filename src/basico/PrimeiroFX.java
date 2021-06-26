package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
					
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("SAIR");
		
		//define atravez da lambda a ação do botão
		botaoA.setOnAction(e -> System.out.println("A"));
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e ->{System.exit(0);	});//fecha a aplicação
		
		//vertical box
		VBox box = new VBox();
		box.setAlignment(Pos.CENTER); //centraliza o box de botões no centro da tela
		box.setSpacing(10); //espaço entre os botões
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		//criando uma cena	
		Scene unicaCena = new Scene(box, 200,400); //cena, e tamanho da cena
		
		primaryStage.setScene(unicaCena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
