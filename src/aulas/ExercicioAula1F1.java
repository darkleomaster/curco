package aulas;

import java.util.Locale;

public class ExercicioAula1F1 {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, wich price is R$%.2f %n%s, wich price is R$%.2f %n%n", product1, price1, product2, price2);
		
		System.out.printf("%d years old, code %d and gender: %c %n%n", age, code, gender);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US Decimal Point: %.3f", measure);
	}

}
