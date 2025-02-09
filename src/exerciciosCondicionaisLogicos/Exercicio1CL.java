package exerciciosCondicionaisLogicos;

import java.util.Scanner;

public class Exercicio1CL {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1) Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		System.out.print("Número: ");
		int num = scan.nextInt();
		
		if (num < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}
		
		scan.close();
	}

}
