package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {

	public TesteStackPane() {
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		getChildren().addAll(c1, c2, c3, c4, c5, c6);

		this.setOnMouseClicked(e -> {
			// e.getSceneX() paga o ponto X de onde ocorreu o click na cena e
			// verifica se é maior q metade da tela
			if (e.getSceneX() > getScene().getWidth() / 2) {
				System.out.println("Direito");
				// quando clica no lado direito, vai para a próxima caixa
				// pela o indice zero e manda para a frente da lista
				getChildren().get(0).toFront();
			} else {
				System.out.println("esquerdo");
				getChildren().get(5).toBack();
			}
		});

		Thread t = new Thread(() -> {
			while(true) {				
				try {
					Thread.sleep(3000);
					
					// para corrigir o erro: Not on FX application thread; currentThread = Thread-3
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
				} catch (Exception e) {					 
					System.out.println(e.getMessage());
				}
								
			}
		});
		//esse parametro faz com que a tread morra quando a aplicacao morrer 
		t.setDaemon(true);
		t.start();
	}
}
