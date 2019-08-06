package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int x, y;

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite os Valores de Coordenadas para X e Y: ");
		x = entradaDados.nextInt();
		y = entradaDados.nextInt();
		
		while(x != 0 && y != 0) {
			
			if(x < 0 && y > 0) {
				
				System.out.println("Ponto Percente ao Segundo Quadrante");
			}
			else if (x < 0 && y < 0) {
				
				System.out.println("Ponto Percente ao Terceiro Quadrante");
			}
			else if(x > 0 && y < 0) {
				
				System.out.println("Ponto Percente ao Quarto Quadrante");
			}
			else {
				
				System.out.println("Ponto Percente ao Primeiro Quadrante");
			}
			
			System.out.println("Digite os Valores de Coordenadas para X e Y: ");
			x = entradaDados.nextInt();
			y = entradaDados.nextInt();
		}
		System.out.println("Quadrante Nulo");

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
