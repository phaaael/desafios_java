package estrutura_de_controle;

import java.util.Scanner;

public class anoBissexto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o Ano:");
		int ano = input.nextInt();
		
		if( ano % 4 == 0) {
			System.out.println("O ano: " + ano + " e Bissexto !");
		} else {
			System.out.println("O ano: " + ano + " nao e Bissexto !");
		}
		
		input.close();
	}
}
