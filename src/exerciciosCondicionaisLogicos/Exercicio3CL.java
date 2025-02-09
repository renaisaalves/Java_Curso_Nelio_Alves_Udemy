package exerciciosCondicionaisLogicos;

import java.util.Scanner;

public class Exercicio3CL {

	public static void main(String[] args) {
		
		// 3) Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Número A: ");
		int a = scan.nextInt();
		
		System.out.print("Número B: ");
		int b = scan.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("SÃO múltiplos");
		} else {
			System.out.println("NÃO SÃO múltiplos");
		}
		
		scan.close();

	}

}
