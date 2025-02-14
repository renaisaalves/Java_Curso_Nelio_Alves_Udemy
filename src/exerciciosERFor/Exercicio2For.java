package exerciciosERFor;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 2) Leia um valor inteiro N. Este valor será a quantidade de valores inteiros
		// X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		// intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		// informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		// "out" para fora do intervalo).
		
		int quantIn = 0;
		int quantOut = 0;
		int n = scan.nextInt();
		
		for (int i=0; i<n; i++) {
			int x = scan.nextInt();
			if (x >= 10 && x <= 20) {
				quantIn = quantIn + 1;
			} else {
				quantOut = quantOut + 1;
			}
		}
		
		System.out.println(quantIn + " in");
		System.out.println(quantOut + " out");

		scan.close();

	}

}
