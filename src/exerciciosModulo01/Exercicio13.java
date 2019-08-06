package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		double x, y;

		System.out.println("----------Início do Programa----------");
		System.out.println("Por favor, digite um valor para X e Y: ");
		x = entradaDados.nextDouble();
		y = entradaDados.nextDouble();

		if (x == 0 && y == 0) {

			System.out.println("Ponto de Origem");

		} else if (x < 0 && y >= 0) {

			System.out.println("Q2");

		} else if (x < 0 && y < 0) {

			System.out.println("Q3");

		} else if (x >= 0 && y < 0) {

			System.out.println("Q4");

		}

		else {
			System.out.println("Q1");
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
