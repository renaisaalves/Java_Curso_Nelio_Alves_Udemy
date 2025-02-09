package exerciciosCondicionaisLogicos;

import java.util.Scanner;

public class Exercicio2CL {

	public static void main(String[] args) {
		
		//2) Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número: ");
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Este número é PAR");
		} else {
			System.out.println("Este número é ÍMPAR");
		}
		
		scan.close();
		


	}

}
