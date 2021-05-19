package model;



public class Proprietario extends Pessoa {

	protected String senha;
	protected String nivelAcesso;
	
	public Proprietario(int id, String nome, String sexo, String dataNascimento, String telefone, String email, String rg,
			String senha, String nivelAcesso) {
		super(id, nome, sexo, dataNascimento, telefone, email, rg);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public Proprietario(int id, String nome,String senha) {
		super(id, nome);
		this.senha = senha;
		
	}

	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	
	
	

	
}