package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int x;

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite um número: ");
		x = entradaDados.nextInt();

		for (int i = 0; i <= x && x <= 1000; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
