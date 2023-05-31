package classes_e_metodos.jantar;

public class Comida {
    String nome;
    double peso;

    Comida() {
        this.nome = "Desconhecido";
        this.peso = 0.0;
    }

    Comida(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    String informarComida() {
        return "Alimento -> " + nome + " | Peso -> " + peso + " Kgs.";
    }
}
