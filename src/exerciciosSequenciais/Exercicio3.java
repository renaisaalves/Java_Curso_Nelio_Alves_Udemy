package exerciciosSequenciais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 3) Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).*/ 
		System.out.println("Digite 4 valores numéricos:");
		System.out.print("Valor 1: ");
		int a = scan.nextInt();
		System.out.print("Valor 2: ");
		int b = scan.nextInt();
		System.out.print("Valor 3: ");
		int c = scan.nextInt();
		System.out.print("Valor 4: ");
		int d = scan.nextInt();
		
		int diferenca = a * b - c * d;
		
		System.out.println("Diferença: " + diferenca);
		
		scan.close();

	}

}
