package aplicacao;

import java.util.Scanner;

import entidades.Pensao;

public class FixacaoModulo5 {

	public static void main(String[] args) {
		
		Pensao[] aluguel = new Pensao[10];
		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("----------Início do Programa----------");
		System.out.println("Quantos quartos serão alugados?");
		int n = entradaDeDados.nextInt();
		System.out.println("------------------------------------");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Locação #%d :%n", i+1);
			System.out.print("Digite o nome do locator: ");
			entradaDeDados.nextLine();
			String nome = entradaDeDados.nextLine();
			System.out.print("Digite o email do locator: ");
			String email = entradaDeDados.nextLine();
			System.out.print("Digite o quarto quer será alugado: ");
			int quarto = entradaDeDados.nextInt();
			aluguel[quarto] = new Pensao(quarto, nome, email);
			System.out.println("------------------------------------");
		}
		System.out.println("Quartos Ocupados:");
		for (int i = 0; i < aluguel.length; i++) {
			if(aluguel[i] != null) {
				
				System.out.println(aluguel[i]);
			}
		}


		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();

	}

}
