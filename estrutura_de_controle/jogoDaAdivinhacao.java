package estrutura_de_controle;

import java.util.Random;

import java.util.Scanner;

public class jogoDaAdivinhacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Numero escondido, ACHE !!");
		
		Random gerador = new Random();
		
        for (int i = 0; i < 1; i++) {
        	int numeroEscondido = gerador.nextInt(100);
        	for(int j = 10; j <= 0; j--) {
        		System.out.println("Numero errado, restam: " + j + " chance");
        			
        		}
        	}
        input.close();
        }
}
