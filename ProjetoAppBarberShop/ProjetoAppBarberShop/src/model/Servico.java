package model;

public class Servico {

	protected int id;
	protected String descricao;
	protected float valor;
	
	
	public Servico(int id, String descricao, float valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
	
	
}
