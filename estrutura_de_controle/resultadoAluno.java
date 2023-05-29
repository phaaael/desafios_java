package estrutura_de_controle;

import java.util.Scanner;

public class resultadoAluno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira Nota:");
		double primeiraNota = input.nextDouble();
		
		System.out.println("Digite a segunda Nota:");
		double segundaNota = input.nextDouble();
		
		double media = (primeiraNota + segundaNota) / 2;
		
		if(media >= 7.0 && media <= 10.0) {
			System.out.println("Aluno Aprovado ! Media -> " + media);
		} else if (media <= 7.0 && media >= 4.0) {
			System.out.println("Aluno de Recuperacao ! Media -> " + media);
		} else if (media <= 4.0 && media >= 0) {
			System.out.println("Aluno Reprovado ! Media -> " + media);
		} else {
			System.out.println("Nota Invalida !");
		}
		
		input.close();
	}
}
