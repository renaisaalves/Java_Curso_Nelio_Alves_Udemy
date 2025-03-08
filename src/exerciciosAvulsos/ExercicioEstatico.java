package exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

import classes.ConversorMoeda;

public class ExercicioEstatico {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		// ConversorMoeda converter = new ConversorMoeda();
		
		System.out.print("Cotação em dólar $: ");
		double cotacao = scan.nextDouble();
				
		System.out.print("Valor em dólar $: ");
		double valor = scan.nextDouble();
		
		System.out.printf("Valor com imposto IOF: R$%.2f", ConversorMoeda.Converter(cotacao, valor));
		
		scan.close();

	}

}
