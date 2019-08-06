package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		double raio, area;
		double pi = 3.14159;

		System.out.println("----------Início do Programa----------");

		System.out.println("Por favor digite do raio: ");
		raio = entradaDados.nextDouble();
		area = pi * (raio * raio);

		System.out.printf("A = %.4f %n", area);

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();
	}
}
