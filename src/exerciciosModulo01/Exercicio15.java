package exerciciosModulo01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		int senha;

		System.out.println("----------Início do Programa----------");

		System.out.println("Digite sua senha: ");
		senha = entradaDados.nextInt();
		
		while(senha != 2002) {
			
			System.out.println("Senha Inválida! Tente novamente:");
			senha = entradaDados.nextInt();
		}
		System.out.println("Acesso Permitido! Bem Vindo.");

		System.out.println("----------Fim do Programa----------");

		entradaDados.close();
		
	}

}
