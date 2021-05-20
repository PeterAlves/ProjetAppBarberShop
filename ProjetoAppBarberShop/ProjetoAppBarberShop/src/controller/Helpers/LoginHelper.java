package controller.Helpers;

import model.Proprietario;
import view.Login;

public class LoginHelper {

	private final Login view;

	public LoginHelper(Login view) {
		this.view = view;
	}

	public Proprietario obterModelo() {
		String nome = view.getLabelLogin().getText();
		String senha = view.getLabelSenha().getText();

		Proprietario modelo = new Proprietario(0, nome, senha);
		return modelo;
	}
	
	public void setarModelo(Proprietario modelo) {
		String nome = modelo.getNome();
		String senha = modelo.getSenha();
		
		view.getLabelLogin().setText(nome);
		view.getLabelSenha().setText(senha);
	}
	
	public void limparTela() {
		view.getLabelLogin().setText("");
		view.getLabelSenha().setText("");
		
		
	}
}
