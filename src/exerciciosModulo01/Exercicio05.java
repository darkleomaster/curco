package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int peca1, peca2, qtdP1, qtdP2;
		double valorP1, valorP2, valorPagar;

		System.out.println("----------In�cio do Programa----------");

		System.out.println("Digite o codigo do Produto1:");
		peca1 = entradaDados.nextInt();
		System.out.println("Digite a quatidade do Produto1:");
		qtdP1 = entradaDados.nextInt();
		System.out.println("Digite o valor unit�rio do Produto1:");
		valorP1 = entradaDados.nextDouble();
		System.out.println("Digite o codigo do Produto2:");
		peca2 = entradaDados.nextInt();
		System.out.println("Digite a quatidade do Produto2:");
		qtdP2 = entradaDados.nextInt();
		System.out.println("Digite o valor unit�rio do Produto2:");
		valorP2 = entradaDados.nextDouble();
		
		System.out.printf("%nPe�a1 c�digo: %d%nQuantidade: %d%nValor Unit�rio: %.2f", peca1, qtdP1, valorP1);
		System.out.printf("%nPe�a2 c�digo: %d%nQuantidade: %d%nValor Unit�rio: %.2f%n", peca2, qtdP2, valorP2);
		
		valorPagar = (qtdP1*valorP1) + (qtdP2*valorP2);
		System.out.println("===============================================");
		System.out.printf("Valor Total para Pagar = R$%.2f %n", valorPagar);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
