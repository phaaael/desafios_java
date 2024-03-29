package classes_e_metodos.produto;

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

	String obterInformacaoFormatada() {
		return "Produto -> " + nome + " | Valor -> R$" + preco + " | Desconto -> " + (desconto * 100) + "%";
	}
}
