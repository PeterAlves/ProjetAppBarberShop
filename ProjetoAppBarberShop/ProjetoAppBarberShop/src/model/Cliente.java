package model;




public class Cliente extends Pessoa {


	public Cliente(int id, String nome, String sexo, String dataNascimento, String telefone, String email, String rg,
			Endereco endereco) {
		super(id, nome, sexo, dataNascimento, telefone, email, rg, endereco);
	}


	public Cliente(int id, String nome,Endereco endereco) {
		super(id, nome);
		this.endereco = endereco;
		
	}


}
