package fundamentos;

import java.util.Scanner;

public class desafioConversao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String salarioUm, salarioDois, salarioTres;
		
		System.out.println("Digite o primeiro Salario:");
		salarioUm = input.nextLine().replace("," , ".");
		
		
		System.out.println("Digite o segundo Salario:");
		salarioDois = input.nextLine().replace("," , ".");
		
		
		System.out.println("Digite o tercerio Salario:");
		salarioTres = input.nextLine().replace("," , ".");
		
		input.close();
		
		double salarioUmConvertido = Double.parseDouble(salarioUm);
		double salarioDoisConvertido = Double.parseDouble(salarioDois);
		double salarioTresConvertido = Double.parseDouble(salarioTres);
		
		System.out.println("Media do Salario: R$ " + (salarioUmConvertido + salarioDoisConvertido + salarioTresConvertido) / 3);
	}
}
