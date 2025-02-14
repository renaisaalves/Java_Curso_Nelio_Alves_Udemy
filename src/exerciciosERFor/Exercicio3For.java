package exerciciosERFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3For {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		// 3) Leia 1 valor inteiro N, que representa o número de casos de teste que vem
		// a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com
		// uma casa decimal. Apresente a média ponderada para cada um destes conjuntos
		// de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso
		// 3 e o terceiro valor tem peso 5.
		
		int n = scan.nextInt();
		
		for (int i=0; i<n; i++) {
			double value1 = scan.nextDouble();
			double value2 = scan.nextDouble();
			double value3 = scan.nextDouble();
			value1 = value1 * 2.0;
			value2 = value2 * 3.0;
			value3 = value3 * 5.0;
			double soma = value1 + value2 + value3;
			double media = soma / 10;
			
			System.out.printf("Media: %.1f", media);
		}

		scan.close();

	}

}
