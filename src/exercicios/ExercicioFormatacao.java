package exercicios;

import java.util.Locale;

public class ExercicioFormatacao {

	public static void main(String[] args) {
		
		String product1 = "Office Desk";
		String product2 = "Coffe";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 4.50;
		double medida = 53.234567;
		
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);
		
		System.out.printf("A medida %f pode ser tratada com casas decimais.%nSe for com três casas: %.3f%nSe for com duas casas %.2f%n", medida, medida, medida);
		Locale.setDefault(Locale.US);

	}

}
