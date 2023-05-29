package fundamentos;

import java.util.Scanner;

public class celsiusParaFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a Temperatura ( Fahrenheit ):");
		double celsius = input.nextDouble();
		
		double conversao = (celsius * 1.8) + 32;
		
		System.out.println("Fahrenheit -> " + conversao);
		
		input.close();
	}
}
