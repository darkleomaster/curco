package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int registro, horasTrabalhadas;
		double valorHora, salario;

		System.out.println("----------In�cio do Programa----------");

		System.out.println("Digite o registro do funcion�rio:");
		registro = entradaDados.nextInt();
		System.out.println("Digite a quatidade de horas trabalhadas:");
		horasTrabalhadas = entradaDados.nextInt();
		System.out.printf("Digite o valor da hora para o funcion�rio %d: %n", registro);
		valorHora = entradaDados.nextDouble();
		salario = horasTrabalhadas * valorHora;
		System.out.printf("Number = %d %n", registro);
		System.out.printf("Sal�rio = %.2f %n", salario);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();
	}

}
