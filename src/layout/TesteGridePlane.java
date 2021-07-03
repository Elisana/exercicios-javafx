package layout;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridePlane extends GridPane{

	public TesteGridePlane() {
		Caixa c1 = new Caixa().comTexto("Caixa1");
		Caixa c2 = new Caixa().comTexto("Caixa2");
		Caixa c3 = new Caixa().comTexto("Caixa3");
		Caixa c4 = new Caixa().comTexto("Caixa4");
		Caixa c5 = new Caixa().comTexto("Caixa5");
		Caixa c6 = new Caixa().comTexto("Caixa6");
		
		setGridLinesVisible(true); //Deixa visível as linhas da grid
		
		//Cria a grid
		getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc());
		getRowConstraints().addAll(rc(), rc(),frc(),rc(),rc());
		
		setVgap(10);
		setHgap(10);
		
		//Adiciona os elementos em cada coluna/linha da grid
		//(objeto/coluna/linha
		//aqui o objeto inicia na linha e coluna 0, e ocupa 5 colunas.
		//add(c1,0,0,5,1);
		
		add(c1,0,0,2,2);
		add(c2,1,1,2,2);
		add(c3,4,2,1,3);
		add(c4,3,1);
		add(c5,0,4,2,1);
		add(c6,3,3);
	}
	
	private ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20); //define percentual de tamanho
		cc.setFillWidth(true); //define se irá preencher automático
		return cc;
	}
	
	//fixa o tamanho
	private ColumnConstraints fcc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setMinWidth(50);
		cc.setMaxWidth(50);
		cc.setFillWidth(true); //define se irá preencher automático
		return cc;
	}
	
	private RowConstraints rc(){
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}
	
	private RowConstraints frc(){
		RowConstraints rc = new RowConstraints();
		rc.setMaxHeight(20);
		rc.setMinHeight(20);
		rc.setFillHeight(true);
		return rc;
	}

}
