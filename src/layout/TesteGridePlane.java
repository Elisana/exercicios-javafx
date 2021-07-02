package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridePlane extends GridPane{

	public TesteGridePlane() {
		Caixa c1 = new Caixa().comTexto("Caixa1");
		Caixa c2 = new Caixa().comTexto("Caixa1");
		Caixa c3 = new Caixa().comTexto("Caixa1");
		Caixa c4 = new Caixa().comTexto("Caixa1");
		Caixa c5 = new Caixa().comTexto("Caixa1");
		Caixa c6 = new Caixa().comTexto("Caixa1");
		
		setGridLinesVisible(true); //Deixa visível as linhas da grid
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20); //define percentual de tamanho
		cc.setFillWidth(true); //define se irá preencher automático
		return cc;
	}
	
	private RowConstraints rc(){
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}

}
