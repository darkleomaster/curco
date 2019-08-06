package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class Programa2 {

	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();
		double aumento;

		System.out.println("----------Início do Programa----------");

		System.out.print("Digite o nome do Funcionário: ");
		funcionario.nome = entradaDeDados.nextLine();
		System.out.print("Insira o Salário Bruto: ");
		funcionario.salarioBruto = entradaDeDados.nextDouble();
		System.out.print("Insira os descontos: ");
		funcionario.desconto = entradaDeDados.nextDouble();
		System.out.println("Funcionário: " + funcionario);
		
		System.out.print("Qual a porcentagem de aumento?");
		aumento = entradaDeDados.nextDouble();
		funcionario.aumentoSalário(aumento);		
		System.out.println("Dados Atualizados: " + funcionario);


		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();

	}

}