package exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

public class Calorias {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CONTADOR DE CALORIAS");
		
		System.out.print("Nome do alimento: ");
		String food = scan.next().toUpperCase();
		System.out.print("Quantidade/porção/peso: ");
		int quant = scan.nextInt();
		System.out.print("Calorias: ");
		double calories = scan.nextDouble();
		
		System.out.print("Deseja adicionar mais algum alimento? ");
		char resp = scan.next().charAt(0);
		System.out.print("Está tudo dando certo " + food + calories + quant);
		
		scan.close();
	}

}
