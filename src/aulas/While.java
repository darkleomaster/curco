package aulas;

import java.util.Locale;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);


		System.out.println("----------In�cio do Programa----------");

		System.out.println("Digite um n�mero: ");
		double n = entradaDados.nextDouble();
		
		while (n >= 0.0) {
			
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.println("Digite outro n�mero: ");
			n = entradaDados.nextDouble();
		}
		System.out.println("N�mero Negativo!");

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
