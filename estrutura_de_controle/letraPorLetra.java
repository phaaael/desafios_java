package estrutura_de_controle;

import java.util.Scanner;

public class letraPorLetra {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite a palavra: ");
		String palavra = input.nextLine();

		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		input.close();
	}
}
