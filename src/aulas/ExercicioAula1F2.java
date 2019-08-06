package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAula1F2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite seu Nome Completo:");
		String nome = sc.nextLine();
		System.out.println("Quantos quartos tem na sua casa?");
		int quarto = sc.nextInt();
		System.out.println("Entre o Preço do Produto:");
		double produto = sc.nextDouble();
		System.out.println("Digite seu sobrenome, idade e altura (mesma linha)");
		String sobrenome = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		System.out.println("----------Resultado----------");

		System.out.println(nome);
		System.out.println(quarto);
		System.out.println(produto);
		System.out.println(sobrenome);
		System.out.println(idade);
		System.out.println(altura);

		System.out.println("----------Fim do Programa----------");

		sc.close();

	}

}
