package exerciciosModulo01;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		int n;
		System.out.println("----------Início do Programa----------");

		System.out.println("Digite um número: ");
		n = entradaDados.nextInt();

		for (int i = 1; i <= n; i++) {
			
			int quad = i * i;
			int cubo = i * (i * i);
			System.out.println(i+" "+quad+" "+cubo);


		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
