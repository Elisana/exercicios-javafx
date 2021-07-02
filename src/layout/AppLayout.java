package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
/*		VBox temp = new VBox();
		temp.getChildren().add(new Caixa().comTexto("Caixa 1"));
		temp.getChildren().add(new Caixa().comTexto("Caixa 2"));
		temp.getChildren().add(new Caixa().comTexto("Caixa 3"));
		temp.getChildren().add(new Caixa().comTexto("Caixa 4"));
		temp.getChildren().add(new Caixa().comTexto("Caixa 5"));
		temp.getChildren().add(new Caixa().comTexto("Caixa 6"));
		temp.getChildren().add(new Caixa().comTexto("Caixa 7")); 
		
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		
		Scene principal = new Scene(temp, 800, 600);		
		
		//seta a cena no palco principal
		primaryStage.setScene(principal); */
		
		Parent raiz = null;
//		raiz = new TesteAnchorPane();
//		raiz = new TesteBorderPane();
//		raiz = new TesteFlowPane();
		raiz = new TesteGridePlane();
		
		Scene principal = new Scene(raiz,800,600);
		primaryStage.setScene(principal);
		
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
