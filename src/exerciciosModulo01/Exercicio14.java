package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		double renda, imposto;

		System.out.println("----------Início do Programa----------");
		System.out.println("Por favor, digite o salário: ");
		renda = entradaDados.nextDouble();

		if (renda >= 0.00 && renda <= 2000.00) {

			System.out.println("Isento");

		} else if (renda > 2000.00 && renda < 3000.01) {

			imposto = (renda - 2000) * 0.08;
			System.out.printf("R$: %.2f%n", imposto);

		} else if (renda > 3000.00 && renda <= 4500.00) {

			imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("R$: %.2f%n", imposto);
		}

		else {
			imposto = (renda-4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("R$: %.2f%n", imposto);
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
