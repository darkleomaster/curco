package entidades;

public class Funcionario2 {
	
	private Integer ID;
	private String nome;
	private Double salario;
	
	public Funcionario2(Integer ID, String nome, double salario) {
		
		this.ID = ID;
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public double aumentoSalario(double porcentagem) {
				
		return salario += salario * porcentagem / 100;
	}

	public Integer getID() {
		return ID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public String toString() {
		return "ID: " + ID + ", Funcionário: " + nome + ", Salário: " + String.format("%.2f", salario);
	}
	
}
