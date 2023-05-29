package fundamentos;

import java.util.Scanner;

public class calculoAreaTriangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a Base:");
		double base = input.nextDouble();
		
		System.out.println("Digite a Altura");
		double altura = input.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.println("Calculo da Area -> " + area);
		
		input.close();
	}
}
