package fundamentos;

import java.util.Scanner;

public class formaulaBhaskara {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o valor de A");
		double valorA = input.nextDouble();
		
		System.out.println("Informe o valor de B");
		double valorB = input.nextDouble();
		
		System.out.println("Informe o valor de C");
		double valorC = input.nextDouble();
		
		double delta = (Math.pow(valorB, 2) - 4 * valorA * valorC);
		
		System.out.println("Valor de Delta -> " + delta);
		
		System.out.println("Deseja Finalizar o Calculo ?");
		String opcao = input.next();
		
		if(opcao.equalsIgnoreCase("sim")) {
			double x1 = (- valorB + Math.sqrt(delta) / 2 * valorA);
			double x2 = (- valorB - Math.sqrt(delta) / 2 * valorA);
			
			System.out.println("Valor de X' -> " + x1);
			System.out.println("Valor de X'' -> " + x2);
		} else {
			System.out.println("Sistema Finalizado ! Resposta Invalida !");
		}
		
		input.close();
	}
}
