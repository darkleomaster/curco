package exerciciosModulo01;

import java.util.Scanner;

public class Reforco2 {

	public static void main(String[] args) {
		
		Scanner entradaDados = new Scanner(System.in);
		double nivelGlicose;
		
		System.out.println("----------Início do Programa----------");

		System.out.println("Digite as Notas: ");
		nivelGlicose = entradaDados.nextDouble();
		

		if (nivelGlicose > 140) {
			
			System.out.println("Glicose Muito Alta!");
		}
		else if (nivelGlicose <= 100) {
			
			System.out.println("Nivel de Glicose Normal");
		}
		else {
			
			System.out.println("Nivel de Glicose Alto");
		}

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
