package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int numero;

		System.out.println("----------In�cio do Programa----------");
		System.out.println("Por favor, digite um n�mero: ");
		numero = entradaDados.nextInt();

		if (numero < 0) {

			System.out.println("Numero Informado � Negativo");
		}

		else {
			System.out.println("Numero Informado � Positivo");
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();
	}
}
