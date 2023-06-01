package arrays_e_collections;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalDasNotas = 0;
        double[] notas;
        
        System.out.println("Digite quantas notas serão calculadas:");
        int quantidadeDeNota = input.nextInt();

        notas = new double[quantidadeDeNota];

        for(int i = 0; i < quantidadeDeNota; i++) {
            System.out.println("Digite a Nota:");
            notas[i] = input.nextDouble();
        }

        for(double nota: notas) {
            totalDasNotas += nota;
        }

        System.out.println("Média do Aluno -> " + (totalDasNotas / notas.length));

        input.close();
    }
}
