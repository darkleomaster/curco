package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int numero;

		System.out.println("----------In�cio do Programa----------");
		System.out.println("Por favor, digite um n�mero: ");
		numero = entradaDados.nextInt();

		if (numero % 2 == 0) {

			System.out.println("Numero Informado � Par");
		}

		else {
			System.out.println("Numero Informado � Impar");
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
