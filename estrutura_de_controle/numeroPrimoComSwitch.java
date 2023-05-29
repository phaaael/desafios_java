package estrutura_de_controle;

import java.util.Scanner;

public class numeroPrimoComSwitch {
	public static void main(String[] args) {
		int contadorDeDivisores = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um Numero:");
		int numero = input.nextInt();
		
		for(int i = 2; i < numero; i++) {
			if(numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		switch (contadorDeDivisores) {
		case 0: {
			System.out.println("O numero: " + numero + " é primo !");
			break;
		}
		default:
			System.out.println("O numero: " + numero + " não é primo !");
		}
		
		input.close();
	}
}
