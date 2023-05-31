package classes_e_metodos.produto;

public class criarProduto {
	public static void main(String[] args) {
		Produto produtoUm = new Produto("Notebook", 4356.89);
		Produto produtoDois = new Produto("Celular", 2000, 0.20);

		System.out.println(produtoUm.obterInformacaoFormatada());
		System.out.println(produtoDois.obterInformacaoFormatada());
	}
}

