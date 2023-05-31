package classes_e_metodos.jantar;

public class Pessoa {
    String nome;
    double peso;

    Pessoa() {
        this.nome = "Desconhecido";
        this.peso = 0.0;
    }

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        if(comida != null) {
            this.peso += comida.peso;
        }
    }

    String apresentar() {
        return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }
}
