package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;
	
	public void entrar() {
		boolean emailValido = campoEmail.getText().equals("aluno@cod3r.com.br"); 
		boolean senhaValida = campoSenha.getText().equals("123");
		
		if(emailValido && senhaValida) {
			//Notifications � da lib 'ControlsFx' que foi importada no projeto
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Login efetuado com sucesso!")
			.showInformation();			
		}else {
			//Notifications � da lib 'ControlsFx' que foi importada no projeto
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Usu�rio e Senha inv�lidos!")
			.showError();			
		}
	}
}
