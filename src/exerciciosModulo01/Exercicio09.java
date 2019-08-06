package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int n1, n2;

		System.out.println("----------Início do Programa----------");
		System.out.println("Por favor, digite dois números inteiros: ");
		n1 = entradaDados.nextInt();
		n2 = entradaDados.nextInt();

		if (n1 % n2 == 0 || n2 % n1 == 0) {

			System.out.printf("Os números %d e %d são Multiplos%n", n1, n2);
		}

		else {
			System.out.printf("Os números %d e %d não são Multiplos%n", n1, n2);
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
