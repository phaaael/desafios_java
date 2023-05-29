package estrutura_de_controle;

import java.util.Scanner;

public class maiorNumero {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("\nDigite um numero: ");
			int valor = input.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);
		input.close();
	}

}