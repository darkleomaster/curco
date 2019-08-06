package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite os Valor para A: ");
		a = entradaDados.nextDouble();
		System.out.println("Digite os Valor para B: ");
		b = entradaDados.nextDouble();
		System.out.println("Digite os Valor para C: ");
		c = entradaDados.nextDouble();

		triangulo = (a * c) / 2;
		circulo = pi * c * c;
		trapezio = ((a + b) * c) / 2;
		quadrado = b * b;
		retangulo = a * b;

		System.out.printf("%nTriangulo: %.3f", triangulo);
		System.out.printf("%nCírculo: %.3f", circulo);
		System.out.printf("%nTrapézio: %.3f", trapezio);
		System.out.printf("%nQuadrado: %.3f", quadrado);
		System.out.printf("%nRetângulo: %.3f %n", retangulo);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();
	}

}
