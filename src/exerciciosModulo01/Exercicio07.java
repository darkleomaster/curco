package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int numero;

		System.out.println("----------Início do Programa----------");
		System.out.println("Por favor, digite um número: ");
		numero = entradaDados.nextInt();

		if (numero < 0) {

			System.out.println("Numero Informado é Negativo");
		}

		else {
			System.out.println("Numero Informado é Positivo");
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();
	}
}
