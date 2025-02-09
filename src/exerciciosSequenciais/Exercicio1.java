package exerciciosSequenciais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* 1) Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.*/ 
		
		System.out.println("Digite um número: ");
		int x = scan.nextInt();
		System.out.println("Digite outro número: ");
		int y = scan.nextInt();
		
		int total = x + y;
		
		System.out.println("O total dos dois números informados é: " + total);
		
		scan.close();

	}

}
