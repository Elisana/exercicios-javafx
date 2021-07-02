package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class contador extends Application {

	private int contador = 0;

	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		//alterando a cor do label
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if (contador > 0) {
			label.getStyleClass().add("verde");	
		}else if (contador < 0){
			label.getStyleClass().add("vermelho");
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		//caminho do arquivoCSS 
		String caminhoDoCss = getClass()
						.getResource("/basico/contador.css").toExternalForm();
				
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");

		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);		
		});

		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction( e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		
		Button botaoCarolina = new Button("EU TE AMO MÃE BEIJOS!");
		botaoCarolina.setOnAction(e -> {			
			labelNumero.setText("MINHA MÃE É BONITA");
		});

		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		

		VBox boxConteudo = new VBox();
		//adicionando o style no box (coloca o nome da classe do css:
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setSpacing(10);
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		boxConteudo.getChildren().add(botaoCarolina);

		
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		
		//aqui, adiciona o arquivo CSS (Cascade StylesSheets = CSS)
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		//aqui busca a fonte direto na internet
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");

		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
