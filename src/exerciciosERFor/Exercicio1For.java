package exerciciosERFor;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 1) Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de
		// 1 até X, um valor por linha, inclusive o X, se for o caso.

		int value = scan.nextInt();

		for (int i = 0; i <= value; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		scan.close();

	}

}
