package exerciciosAvulsos;

import java.util.Scanner;
import classes.INSS;

public class CalculoGPS {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		INSS calculoGPS = new INSS();
		
		System.out.println("CÁLCULO DA GUIA DA PREVIDÊNCIA SOCIAL 2025");
		System.out.println("");
		
		System.out.println("• [1] Contribuinte Individual\n• [2] Contribuinte Facultativo\n");
		
		System.out.print("Selecione a categoria: ");
		calculoGPS.categoriaContribuinte = scan.nextInt();
		
		System.out.print("Alíquota: " );
		calculoGPS.aliquota = scan.nextInt();
		
		if (calculoGPS.aliquota == 20) {
			System.out.print("Salário de contribuição R$: ");
			double salario = scan.nextDouble();
			calculoGPS.calculadora20(salario);
			System.out.printf("Taxa de contribuição: R$%.2f%n", calculoGPS.calculadora20(salario));
		}
		
		System.out.printf("Taxa de contribuição: R$%.2f%n", calculoGPS.calculadora());
		
		
		scan.close();

	}

}
