package view;

import model.Pessoa;

public class Execucao {
	public static void main(String args[]) {
	Pessoa pessoa = new Pessoa();
	
	pessoa.setNome("Joao Vitor");
	System.out.println(pessoa.getNome());
	
	pessoa.setEndereco("Av Aguia de Haia");
	System.out.println(pessoa.getEndereco());
	
	pessoa.setBairro("A.E. Carvalho");
	System.out.println(pessoa.getBairro());
	
	pessoa.setCep(36940000);
	System.out.println("0" + pessoa.getCep());
	
	pessoa.setCidade("São Paulo");
	System.out.println(pessoa.getCidade());
	
	pessoa.setEstado("SP");
	System.out.println(pessoa.getEstado());
	
	}
}