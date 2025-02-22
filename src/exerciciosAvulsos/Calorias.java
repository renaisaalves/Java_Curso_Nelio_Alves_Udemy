package exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

public class Calorias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double totCalories = 0;
		char resp;
		
		do {
			System.out.print("Alimento: ");
			String food = scan.nextLine().toUpperCase();
			System.out.print("Gramas: ");
			double mg = scan.nextDouble();
			System.out.print("Calorias: ");
			double calories = scan.nextDouble();
			System.out.print("Quantidade: ");
			int quant = scan.nextInt();
			if (quant > 1) {
				mg *= quant;
				calories *= quant;
			}
			System.out.format("\nAlimento: %s%nPeso: %.0f gramas%nCalorias: %.0fkcal\n", food, mg, calories);
			for (int i=0; i<quant; i++) {
				totCalories = calories;
			}
			
			System.out.print("Adicionar mais um alimento?\n[Sim/Não]: ");
			resp = scan.next().charAt(0);
		} while (resp == 'S' || resp == 's');
		

		System.out.printf("Total de calorias: %.0fkcal", totCalories);

		scan.close();
	}

}
