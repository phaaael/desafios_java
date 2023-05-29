package fundamentos;

import java.util.Scanner;

public class calculadoraIMC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o Peso:");
		double peso = input.nextDouble();
		
		System.out.println("Informe a Altura:");
		double altura = input.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2));
		
		System.out.println("IMC -> " + imc);
		
		input.close();
	}
}
