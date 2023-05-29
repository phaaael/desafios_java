package estrutura_de_controle;

import java.util.Random;

import java.util.Scanner;

public class jogoDaAdivinhacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		
		int numero = random.nextInt(100);
		
		System.out.println("Numero Escondido, Acerte !");
		
		for(int chance = 10; chance > 0;) {
			System.out.println("Chances -> " + chance);
			
			System.out.println("Digite o Numero:");
			int numeroDigitado = input.nextInt();
			
			if(numeroDigitado == numero) {
				System.out.println("Parabens ! Voce Ganhou !");
				break;
			} else if(numeroDigitado != numero) {
				chance--;
				if(chance == 0 ) {
					System.out.println("Suas chances acabaram ! Sistema Finalizado !");
				}
			}  else {
				System.out.println("Algo deu Errado ! Sistema Finalizado !");
			}
		}
		
        input.close();
	}
}
