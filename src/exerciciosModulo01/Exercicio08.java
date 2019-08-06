package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int numero;

		System.out.println("----------Início do Programa----------");
		System.out.println("Por favor, digite um número: ");
		numero = entradaDados.nextInt();

		if (numero % 2 == 0) {

			System.out.println("Numero Informado é Par");
		}

		else {
			System.out.println("Numero Informado é Impar");
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
