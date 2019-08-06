package exerciciosModulo01;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		int n;
		int result = 1;
		System.out.println("----------Início do Programa----------");

		System.out.println("Digite um número: ");
		n = entradaDados.nextInt();

		for (int i = 1; i <= n ; i++) {
			
			result = result * i;
			
		}
		
		System.out.println(result);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
