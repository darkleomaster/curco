package aplicacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import entidades.Funcionario2;

public class ExercicioListModulo5 {

	public static void main(String[] args) {
		
		List<Funcionario2> list = new ArrayList<>();
		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("----------Início do Programa----------");
		System.out.print("Quantos funcionários serão cadastrados?");
		int n = entradaDeDados.nextInt();
		System.out.println("------------------------------------");
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Funcionário #%d :%n", i+1);
			System.out.print("ID:");
			Integer id = entradaDeDados.nextInt();
			System.out.print("Nome:");
			entradaDeDados.nextLine();
			String nome = entradaDeDados.nextLine();
			System.out.print("Salário:");
			Double salario = entradaDeDados.nextDouble();
			list.add(new Funcionario2(id, nome, salario));
			System.out.println("------------------------------------");
		}
		System.out.print("Qual funcionário terá aumento?");
		int aumento = entradaDeDados.nextInt();
		Funcionario2 cadastroFuncionario = list.stream().filter(x -> x.getID()==aumento).findFirst().orElse(null);
		if(cadastroFuncionario != null) {
			System.out.print("Qual a porcentagem de aumento?");
			double porcentagem = entradaDeDados.nextDouble();
			cadastroFuncionario.aumentoSalario(porcentagem);
		}
		else {
			System.out.println("Funcionário não existe!");
		}
				
		System.out.println("------------------------------------");
		System.out.println("Lista de Funcionários: ");
		for(Funcionario2 obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("----------Fim do Programa----------");
		entradaDeDados.close();

	}

}
