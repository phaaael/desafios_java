package fundamentos;

import java.util.Scanner;

public class fahrenheitParaCelsius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a temperatura ( fahrenheit ):");
		double fahrenheit = input.nextDouble();
		
		double conversao = (fahrenheit - 32) / 1.8;
		
		System.out.println("Celsius -> " + conversao);
		
		input.close(); 
	}
}
