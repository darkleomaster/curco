package exerciciosModulo01;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		int n, x, y;

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite um número: ");
		n = entradaDados.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os valores para divisão: ");
			x = entradaDados.nextInt();
			y = entradaDados.nextInt();

			if (y == 0) {

				System.out.println("Divisão Impossível");
			} else {

				double result = (double)x / y;
				System.out.printf("Resultado: %.1f%n", result);
			}
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
