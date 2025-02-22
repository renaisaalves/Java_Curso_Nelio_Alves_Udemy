package exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

public class Calorias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("CONTADOR DE CALORIAS");

		char resp;
		do {
			System.out.print("Nome do alimento: ");
			String food = scan.next().toUpperCase();
			System.out.print("Peso: ");
			double peso = scan.nextDouble();
			System.out.print("Calorias: ");
			double calories = scan.nextDouble();
			System.out.print("Quantidade: ");
			int quant = scan.nextInt();

			System.out.print("\nDeseja adicionar mais algum alimento?");
			resp = scan.next().charAt(0);
		} while (resp == 's' || resp == 'S');

		System.out.printf("\nAlimento(s): %s%nQuantidade: %d%nCalorias: %.2fkcal%n", food, quant, calories);

		scan.close();
	}

}
