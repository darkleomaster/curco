package exerciciosModulo01;

import java.util.Scanner;

public class Reforco3 {

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);
		int x, y;
		
		System.out.println("----------In�cio do Programa----------");

		System.out.println("Digite dois valores: ");
		x = entradaDados.nextInt();
		y = entradaDados.nextInt();
		
		int in = x, end = y;

		if (y < x) {
						
			in = y;
			end = x;
		}
		
		int soma = 0;
		for (int i = in; i <= end; i++) {
			if (i % 2 != 0) {
				
				soma +=i;
				
			}
			
		}
		
		System.out.println("Soma dos N�mero �mpares: "+ soma);
		

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();

	}

}
