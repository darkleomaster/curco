package aplicacao;

import java.util.Scanner;

import entidades.ConverterMoeda;

public class Programa4 {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in);

		System.out.println("----------Início do Programa----------");

		System.out.print("Qual o valor do Dólar? ");
		double valorDollar = entradaDeDados.nextDouble();
		System.out.print("Quantos dólares pretende comprar? ");
		double qtdDollar = entradaDeDados.nextDouble();
		System.out.println("----------Resultado----------");
		double result = ConverterMoeda.conversor(valorDollar, qtdDollar);
		System.out.printf("Valor convertido em reais = %.2f%n", result);
		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();

	}

}
