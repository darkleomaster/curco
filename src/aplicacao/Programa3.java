package aplicacao;

import java.util.Scanner;

import entidades.Aluno;

public class Programa3 {

	public static void main(String[] args) {
		
		Scanner entradaDeDados = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("----------Início do Programa----------");

		System.out.print("Digite o nome do Aluno: ");
		aluno.nome = entradaDeDados.nextLine();
		System.out.print("Insira a Nota do Primeiro trimestre: ");
		aluno.nota1 = entradaDeDados.nextDouble();
		System.out.print("Insira a Nota do Segundo trimestre: ");
		aluno.nota2 = entradaDeDados.nextDouble();
		System.out.print("Insira a Nota do Terceiro trimestre: ");
		aluno.nota3 = entradaDeDados.nextDouble();	
		System.out.println("----------Resultado----------");
		aluno.calculoNotas();


		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();

	}

}
