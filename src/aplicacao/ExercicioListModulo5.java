package aplicacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Funcionario2;

public class ExercicioListModulo5 {

	public static void main(String[] args) {
		
		List<Funcionario2> list = new ArrayList<>();
		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("----------In�cio do Programa----------");
		System.out.print("Quantos funcion�rios ser�o cadastrados?");
		int n = entradaDeDados.nextInt();
		System.out.println("------------------------------------");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Funcion�rio #%d :%n", i+1);
			System.out.print("ID:");
			Integer id = entradaDeDados.nextInt();
			System.out.print("Nome:");
			entradaDeDados.nextLine();
			String nome = entradaDeDados.nextLine();
			System.out.print("Sal�rio:");
			Double salario = entradaDeDados.nextDouble();
			list.add(new Funcionario2(id, nome, salario));
			System.out.println("------------------------------------");
		}
		System.out.print("Qual funcion�rio ter� aumento?");
		int aumento = entradaDeDados.nextInt();
		Funcionario2 cadastroFuncionario = list.stream().filter(x -> x.getID()==aumento).findFirst().orElse(null);
		if(cadastroFuncionario != null) {
			System.out.print("Qual a porcentagem de aumento?");
			double porcentagem = entradaDeDados.nextDouble();
			cadastroFuncionario.aumentoSalario(porcentagem);
		}
		else {
			System.out.println("Funcion�rio n�o existe!");
		}
				
		System.out.println("------------------------------------");
		System.out.println("Lista de Funcion�rios: ");
		for(Funcionario2 obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();

	}

}
