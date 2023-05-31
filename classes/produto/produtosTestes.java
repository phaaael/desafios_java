package classes.produto;

public class produtosTestes {
	public static void main(String[] args) {
		Produto produtoUm = new Produto("Notebook", 4356.89);
		Produto produtoDois = new Produto("Celular", 2000, 0.20);
		
		System.out.println("Produto -> " + produtoUm.nome + " | Valor -> R$" + produtoUm.preco + " | Desconto -> " + produtoUm.desconto + "%");
		System.out.println("Produto -> " + produtoDois.nome + " | Valor -> R$" + produtoDois.preco + " | Desconto -> " + produtoDois.desconto * 100 + "%");
	}
}
