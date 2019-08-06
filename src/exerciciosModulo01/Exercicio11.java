package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int codigo, qtd;
		double total;

		System.out.println("----------Início do Programa----------");
		System.out.println("Por favor, digite o código do item: ");
		codigo = entradaDados.nextInt();
		System.out.println("Por favor, digite a quantidade a ser comprada: ");
		qtd = entradaDados.nextInt();

		if (codigo == 1) {

			total = qtd * 4.00;
			System.out.printf("Total a ser pago: %.2f %n", total);

		}

		else if (codigo == 2) {

			total = qtd * 4.50;
			System.out.printf("Total a ser pago: %.2f %n", total);

		}

		else if (codigo == 3) {

			total = qtd * 5.00;
			System.out.printf("Total a ser pago: %.2f %n", total);

		}

		else if (codigo == 4) {

			total = qtd * 2.00;
			System.out.printf("Total a ser pago: %.2f %n", total);

		}

		else if (codigo == 5) {

			total = qtd * 1.50;
			System.out.printf("Total a ser pago: %.2f %n", total);

		}

		else {

			System.out.println("Produto não cadastrado!");
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
