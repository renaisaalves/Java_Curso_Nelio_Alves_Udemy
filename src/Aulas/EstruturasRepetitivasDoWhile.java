package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturasRepetitivasDoWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// Converter ºC para ºF

		char resp;
		do {
			System.out.print("Temperatura ºC (Celsius): ");
			double c = scan.nextDouble();
			double f = c * 1.8 + 32;
			System.out.printf("Temperatura ºF (Fahrenheit): %.1f%n", f);
			System.out.print("Deseja repetir? (s/n): ");
			resp = scan.next().charAt(0);
		} while (resp != 'n');

		scan.close();

	}

}

// O comando "do" vai ser executado independente da condição lógica (verdadeira ou falsa). Somente em while será verificado a condição lógica. Se a sentença for verdadeira, o comando "do" será novamente executado. Caso contrário, não.