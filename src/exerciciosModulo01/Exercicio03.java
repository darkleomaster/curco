package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int a, b, c, d, resultado;

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite o valor para A:");
		a = entradaDados.nextInt();
		System.out.println("Digite o valor para B:");
		b = entradaDados.nextInt();
		System.out.println("Digite o valor para C:");
		c = entradaDados.nextInt();
		System.out.println("Digite o valor para D:");
		d = entradaDados.nextInt();
		resultado = a * b - c * d;
		System.out.printf("Diferença = %d %n", resultado);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
