package classes.produto;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto() {
		
	}
	
	Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	double precoComDesconto() {
		return preco * ( 1 - desconto );
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * ( 1 - desconto + descontoGerente);
	}
}
