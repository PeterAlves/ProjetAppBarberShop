package view;




import model.Agendamento;
import model.Cliente;
import model.Endereco;
import model.Proprietario;
import model.Servico;

public class Main {
	
	

	public static void main(String[] args) {
		String nome = "Peter";
		System.out.println(nome);
		System.out.println();
		
		Servico servico = new Servico(1, "Cabelo Masculino", 15);
		System.out.println(servico.getDescricao());
		System.out.println(servico.getValor());
		System.out.println();
		
		Endereco endereco=new Endereco(1,"Rua do Junior", "1365","Bairro do Junior"," São Paulo", "SP");
		Cliente cliente = new Cliente(1, "Junior", endereco);
		System.out.println(cliente);
		System.out.println();
		
		Proprietario proprietario = new Proprietario(1, "Peter", "senha");
		System.out.println(proprietario.getId());
		System.out.println();
		
		Agendamento agendamento = new Agendamento(1,cliente, servico, 50, "20/05/2021 10:30");
		System.out.println(agendamento.getData());
		System.out.println();
		
		
	}

}
