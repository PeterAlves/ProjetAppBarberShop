package controller;

import controller.Helpers.LoginHelper;
import model.Proprietario;
import view.Login;

public class LoginController {
	
	private final Login view;
	private LoginHelper helper;
	
	public LoginController (Login view){
		this.view = view;
		this.helper = new LoginHelper(view);
	}
	
	public void entrarNoSistema() {
		//Pegar um Proprietario da View
		Proprietario modelo = helper.obterModelo();
		
		
		
	}
	
	
	
	public void fiztarefa() {
		System.out.println("Busquei algo do banco de dados");
		
		this.view.exibeMensagem("Executei o fiz tarefa");
	
	}
	

}
