package exerciciosModulo01;

import java.util.Scanner;

public class Reforco1 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		double nota1, nota2, nota3;
		System.out.println("----------Início do Programa----------");

		System.out.println("Digite as Notas: ");
		nota1 = entradaDados.nextDouble();
		nota2 = entradaDados.nextDouble();
		nota3 = entradaDados.nextDouble();
		
		double total = (nota1 + nota2 + nota3);

		if (total < 60.00) {
			
			System.out.printf("Nota Final: %.2f%nFAILED!%n", total);
		}
		else {
			
			System.out.printf("Nota Final: %.2f%n", total);
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
