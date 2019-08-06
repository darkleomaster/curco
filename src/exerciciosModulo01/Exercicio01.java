package exerciciosModulo01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		int nSoma1, nSoma2, result;

		System.out.println("----------Início do Programa----------");

		System.out.println("Por favor digite o um valor inteiro para realizarmos a soma: ");
		nSoma1 = entradaDados.nextInt();
		System.out.println("Digite outro valor:");
		nSoma2 = entradaDados.nextInt();
		result = nSoma1 + nSoma2;
		System.out.printf("O resultado da soma de %d + %d é: %d %n", nSoma1, nSoma2, result);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
