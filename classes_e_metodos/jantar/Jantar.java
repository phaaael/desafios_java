package classes_e_metodos.jantar;

public class Jantar {
    public static void main(String[] args) {
        Comida comidaUm = new Comida("Feijoada", 2.0);

        Pessoa pessoaUm = new Pessoa("Raphael", 80.90);

        System.out.println(pessoaUm.apresentar());

        System.out.println("Estou comendo o(a) " + comidaUm.nome + " ...");

        System.out.println("Acabei de Engordar " + comidaUm.peso + " Kgs.");

        pessoaUm.comer(comidaUm);

        System.out.println("Meu peso atual é: " + pessoaUm.peso + " Kgs.");
    }
}
