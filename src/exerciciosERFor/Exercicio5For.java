package exerciciosERFor;

import java.util.Scanner;

public class Exercicio5For {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 5) Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N
		// = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		// de 0 é 1.
		
		int n = scan.nextInt();
		
		int factorial = 1;
		for (int i=1; i<=n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println(factorial);

		scan.close();

	}

}
