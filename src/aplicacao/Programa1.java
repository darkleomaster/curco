package aplicacao;

import java.util.Scanner;

import entidades.Retangulo;

public class Programa1 {

	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("----------Início do Programa----------");
		
		System.out.print("Digite a altura do Retângulo: ");
		retangulo.altura = entradaDeDados.nextDouble();
		System.out.print("Digite o largura do Retângulo: ");
		retangulo.largura = entradaDeDados.nextDouble();
		
		System.out.println("----------Resultado----------");
		System.out.printf("Area = %.2f%n", retangulo.area());
		System.out.printf("Perímetro = %.2f%n", retangulo.perimetro());
		System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
		
		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();
		
	}

}