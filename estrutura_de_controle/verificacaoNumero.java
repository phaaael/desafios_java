package estrutura_de_controle;

import java.util.Scanner;

public class verificacaoNumero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um Numero:");
		double numero = input.nextDouble();
		
		if(numero >= 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("PAR");
			} else {
				System.out.println("IMPAR");
			}
			
		} else {
			System.out.println("O numero precisa esta entre 0 e 10 !");
		}
		
		input.close();
	}
}
