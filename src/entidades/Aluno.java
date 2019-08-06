package entidades;

public class Aluno {
	
	public String nome;
	public double nota1, nota2, nota3;
	
	public double calculoNotas() {
		
		double result = nota1 + nota2 + nota3;
		
		if(result < 60.0) {
			double miss = 60 - result;
			System.out.println("Aluno: "+ nome);
			System.out.println("Nota Final = " + result);
			System.out.println("Falhou!");
			System.out.println("Falta " + miss + " pontos.");
			return miss;
		}
		else {
			
			System.out.println("Aluno: "+ nome);
			System.out.println("Nota Final = " + result);
			System.out.println("Passou!");
			return result;
		}
	}

}
