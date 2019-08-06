package aplicacao;

import java.util.Scanner;


public class ExercicioMatriz {

	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("----------Início do Programa----------");

		System.out.print("Digite os valores da matriz: ");
		int n = entradaDeDados.nextInt();
		int m = entradaDeDados.nextInt();
		int[][] mat = new int [n][m];
		
		for(int i=0; i<mat.length;i++) {
			for(int j = 0;j<mat[i].length;j++) {
				mat[i][j] = entradaDeDados.nextInt();
			}
		}
		System.out.print("Digite o valor para procurar na matriz: ");
		int x = entradaDeDados.nextInt();
		System.out.println("---------------------------------------");
		
		for(int i=0; i<mat.length;i++) {
			for(int j = 0;j<mat[i].length;j++) {
				if(mat[i][j]== x) {
					System.out.println("Posição: " + i + ", "+ j);
					if(j > 0) {
						System.out.println("Esquerda: "+ mat[i][j-1]);
					}
					
					if(j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Cima: "+ mat[i-1][j]);
					}
					
					if(i < mat.length-1) {
						System.out.println("Baixo: " + mat[i+1][j]);
					}
					System.out.println("---------------------------------------");
				}
				
			}
		}
		
		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();


	}

}
