package exerciciosModulo01;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		int n; 
		double x = 0, y = 0, z = 0, media;

		System.out.println("----------In�cio do Programa----------");

		System.out.println("Digite um n�mero: ");
		n = entradaDados.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite os valores das notas: ");
			x = entradaDados.nextDouble();
			y = entradaDados.nextDouble();
			z = entradaDados.nextDouble();
			media = (x*2.0+y*3.0+z*5.0)/10;
			System.out.printf("Valor: %.1f%n ", media);
		}
		


		


		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
