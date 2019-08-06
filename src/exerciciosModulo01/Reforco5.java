package exerciciosModulo01;

import java.util.Scanner;

public class Reforco5 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		double nota1, nota2, nota3;

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite o número de estudantes: ");
		int n = entradaDados.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Estudante #" + i + ": ");
			nota1 = entradaDados.nextDouble();
			nota2 = entradaDados.nextDouble();
			nota3 = entradaDados.nextDouble();
			double soma = nota1 + nota2 + nota3;
			System.out.printf("Final Score: %.2f%n", soma);
			
		}
		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
