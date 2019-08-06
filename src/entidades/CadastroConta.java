package entidades;

public class CadastroConta {

	private int numeroConta;
	private String titularConta;
	private double saldo;
	static double TAXA = 5.00;

	public CadastroConta() {

	}
	public CadastroConta(int numeroConta, String titularConta) {

		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}


	public CadastroConta(int numeroConta, String titularConta, double depositoInicial) {

		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		depositoConta(depositoInicial);
	}

	public double depositoConta(double deposito) {
		return saldo += deposito;

	}

	public double saqueConta(double saque) {

		return saldo -= saque + TAXA;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String nome) {
		this.titularConta = nome;
	}
	
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		
		return "Conta: " + numeroConta + ", Títular: " + titularConta + ", Saldo: $ " + String.format("%.2f", saldo);
	}

}