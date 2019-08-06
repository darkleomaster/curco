package entidades;

public class Funcionario {
	
	public String nome;
	public double salarioBruto, desconto;
	
	public double salarioLiquido() {
		
		return salarioBruto - desconto;
	}
	
	public void aumentoSalário(double porcentagem) {
		
		salarioBruto += salarioBruto*porcentagem/100;
		
	}
	
	public String toString() {
		
		return nome + ", $"+String.format("%.2f", salarioLiquido());
	}

}