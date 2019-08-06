package exerciciosModulo01;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		int n;
		System.out.println("----------Início do Programa----------");

		System.out.println("Digite um número: ");
		n = entradaDados.nextInt();

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {

				System.out.println(i);
			}

		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
