package exerciciosModulo01;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		int n;
		System.out.println("----------Início do Programa----------");

		System.out.println("Digite um número: ");
		n = entradaDados.nextInt();

		while (n <= 0) {
			
			System.out.println("Número deve ser positivo! Tente novamente: ");
			n = entradaDados.nextInt();

		}
		
		int maior = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Valor #"+i+" :");
			int x = entradaDados.nextInt();
			if (x > maior) {		
				maior = x;
			}


		}
		System.out.println("Maior Número: "+maior);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
