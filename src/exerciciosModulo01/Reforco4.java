package exerciciosModulo01;

import java.util.Scanner;

public class Reforco4 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		int valor;
		
		System.out.println("----------Início do Programa----------");

		System.out.println("Digite um valor: ");
		valor =  entradaDados.nextInt();
		
		while (valor !=0) {
			
			int soma = valor * valor;
			System.out.printf("%d² = %d%n", valor, soma);
			System.out.println("Digite um valor: ");
			valor =  entradaDados.nextInt();
		}
		
		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
