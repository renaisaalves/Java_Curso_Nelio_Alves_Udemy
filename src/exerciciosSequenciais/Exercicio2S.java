package exerciciosSequenciais;

import java.util.Scanner;

public class Exercicio2S {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 2) Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.*/
		
		System.out.print("Informe o valor do raio de um círculo: ");
		double raio = scan.nextDouble();
		double area = 3.14159 * (raio * raio);
		
		System.out.format("A área do círculo é: %.4f", area);
		
		scan.close();

	}

}
