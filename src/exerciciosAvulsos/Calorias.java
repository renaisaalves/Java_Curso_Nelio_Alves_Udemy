package exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

public class Calorias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Alimento: ");
		String alimento = scan.nextLine();
		System.out.print("Gramas: ");
		int gramas = scan.nextInt();
		System.out.print("Calorias: ");
		double calorias = scan.nextDouble();
		System.out.print("Quantidade: ");
		int quant = scan.nextInt();
		
		if (quant > 1) {
			gramas *= quant;
			calorias *= quant;
			
		}
		
		System.out.printf("\nAlimento: %s%nGramas: %d%nCalorias: %.0fkcal%n", alimento, gramas, calorias);
		
		scan.close();
	}

}
