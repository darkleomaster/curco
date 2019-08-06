package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int codigo, al = 0, gas = 0, die = 0;

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite o código do Produto");
		System.out.println("1 - Álcool");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Sair");
		codigo = entradaDados.nextInt();

		while (codigo != 4) {

			if (codigo == 1) {

				al++;
			} else if (codigo == 2) {
				
				gas++;
				
			} else if (codigo == 3) {

				die++;
			}
			System.out.println("Digite o código do Produto");
			System.out.println("1 - Álcool");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Sair");
			codigo = entradaDados.nextInt();
		}

		System.out.println("Muito Obrigado!");
		System.out.println("Álcool: " + al);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
