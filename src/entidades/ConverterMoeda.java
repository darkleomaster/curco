package entidades;

public class ConverterMoeda {
	
	public static double IOF = 0.06;
	
	public static double conversor(double valorDollar, double qtdDollar) {
		
		return valorDollar * qtdDollar * (1.0 + IOF);
	}

}
