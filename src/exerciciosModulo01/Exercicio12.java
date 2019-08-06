package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		double valor;

		System.out.println("----------Início do Programa----------");
		System.out.println("Por favor, digite um valor qualquer: ");
		valor = entradaDados.nextDouble();

		if (valor < 0 || valor > 100) {

			System.out.println("O valor " + valor + " está fora dos intervalos!");

		} else if (valor >= 0 && valor <= 25) {

			System.out.println("O valor " + valor + " está no intervalo [0,25]");

		} else if (valor > 25 && valor <= 50) {

			System.out.println("O valor " + valor + " está no intervalo [25,50]");

		} else if (valor > 50 && valor <= 75) {

			System.out.println("O valor " + valor + " está no intervalo [50,75]");

		} else {

			System.out.println("O valor " + valor + " está no intervalo [75,100]");
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();
	}

}
