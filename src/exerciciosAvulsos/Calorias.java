package exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

public class Calorias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		 char resp;
		 double totalCalorias = 0;

	        do {
	            System.out.print("Alimento: ");
	            String alimento = scan.nextLine();

	            System.out.print("Gramas: ");
	            int gramas = scan.nextInt();

	            System.out.print("Calorias: ");
	            double calorias = scan.nextDouble();

	            System.out.print("Quantidade: ");
	            int quant = scan.nextInt();
	            scan.nextLine(); // Consome a quebra de linha pendente

	            if (quant > 1) {
	                gramas *= quant;
	                calorias *= quant;
	            }

	            System.out.printf("\nAlimento: %s%nGramas: %d%nCalorias: %.0fkcal%n", alimento, gramas, calorias);
	            
	            totalCalorias += calorias;

	            System.out.print("\nAdicionar mais alimentos? (s/n): ");
	            resp = scan.next().charAt(0);
	            scan.nextLine(); // Consome a quebra de linha pendente
	            
	        } while (resp == 's' || resp == 'S');

	        scan.close();
	        
	        System.out.printf("Total de calorias consumidas: %.0fkcal\n", totalCalorias);
	}

}
