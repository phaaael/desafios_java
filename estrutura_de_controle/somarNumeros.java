package estrutura_de_controle;

import java.util.Scanner;

public class somarNumeros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean iniciar_loop = true;
		
		double total = 0;
		
		while(iniciar_loop) {
			
			
			System.out.println("Digite um Numero:");
			double numeroDigitado = input.nextDouble();
			
			total = numeroDigitado + total;
			
			System.out.println("Total da Soma -> " + total);
			
			if(numeroDigitado == -1) {
				System.out.println("Sistema Finalizado - Total -> " + total);
				
				iniciar_loop = false;
			}
			
		}
		
		input.close();
	}
}
