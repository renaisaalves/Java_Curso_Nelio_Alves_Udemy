package aulas;

import java.util.Scanner;

public class EstruturasRepetitivasFor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int soma = 0;
		
		for (int i=0; i<n; i++) {
			int x = scan.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		for (int i=0; i<=4; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		for (int i=4; i>=0; i--) {
			System.out.println("Valor de i: " + i);
		}
		
		scan.close();

	}

}
