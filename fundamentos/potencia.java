package fundamentos;

import java.util.Scanner;

public class potencia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um Numero:");
		int numero = input.nextInt();
		
		double potenciaAoQuadrado = Math.pow(numero, 2);
		double potenciaAoCubo = Math.pow(numero, 3);
		
		System.out.println("Quadrado: " + potenciaAoQuadrado);
		System.out.println("Cubo: " + potenciaAoCubo);
		
		input.close();
	}
}
