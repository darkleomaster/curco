package exerciciosModulo01;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		int n, x, y;

		System.out.println("----------In�cio do Programa----------");

		System.out.println("Digite um n�mero: ");
		n = entradaDados.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os valores para divis�o: ");
			x = entradaDados.nextInt();
			y = entradaDados.nextInt();

			if (y == 0) {

				System.out.println("Divis�o Imposs�vel");
			} else {

				double result = (double)x / y;
				System.out.printf("Resultado: %.1f%n", result);
			}
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
