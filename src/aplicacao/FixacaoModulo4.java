package aplicacao;

import java.util.Scanner;

import entidades.CadastroConta;

public class FixacaoModulo4 {

	public static void main(String[] args) {
		
		CadastroConta conta = new CadastroConta();

		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("----------Início do Programa----------");

		System.out.print("Digite o número da Conta: ");
		int numeroConta = entradaDeDados.nextInt();
		System.out.print("Digite o nome do Titular da Conta: ");
		entradaDeDados.nextLine();
		String titular = entradaDeDados.nextLine();
		System.out.print("Será feito um depósito Inicial?(S/N)");
		char resposta = entradaDeDados.next().charAt(0);

		if (resposta == 's' || resposta == 'S') {

			System.out.print("Entre com o valor do depósito: ");
			double depositoInicial = entradaDeDados.nextDouble();
			conta = new CadastroConta(numeroConta, titular, depositoInicial);
			System.out.println("Informações da Conta");
			System.out.println(conta);
		} 
		
		else if (resposta == 'n' || resposta == 'N') {

			conta = new CadastroConta(numeroConta, titular);
			System.out.println("Informações da Conta");
			System.out.println(conta);
		} 
		
		else {
			System.out.println("ERROR!");
		}
		
		System.out.println("--------------------");
		System.out.print("Deseja fazer um depósito?");
		resposta = entradaDeDados.next().charAt(0);
		if (resposta == 's' || resposta == 'S') {

			System.out.print("Entre com o valor do depósito: ");
			double deposito = entradaDeDados.nextDouble();
			conta.depositoConta(deposito);
			System.out.println("Dados Atualizados!");
			System.out.println(conta);
			
		} 
		else if (resposta == 'n' || resposta == 'N') {

			System.out.println("Encerrando...");
			System.out.println("Obrigado por utilizar este programa!");
			System.exit(0);
		}
		else {
			System.out.println("ERROR!");
		}
		
		System.out.println("--------------------");
		System.out.print("Deseja fazer um saque?");
		resposta = entradaDeDados.next().charAt(0);
		if (resposta == 's' || resposta == 'S') {

			System.out.print("Entre com o valor do saque: ");
			double saque = entradaDeDados.nextDouble();
			conta.saqueConta(saque);
			System.out.println("Dados Atualizados!");
			System.out.println(conta);
			
		} 
		else if (resposta == 'n' || resposta == 'N') {

			System.out.println("Encerrando...");
			System.out.println("Obrigado por utilizar este programa!");
			System.exit(0);
		}
		else {
			System.out.println("ERROR!");
		}

		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();

	}

}
