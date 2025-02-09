package exerciciosCondicionaisLogicos;

import java.util.Scanner;

public class Exercicio5CL {

	public static void main(String[] args) {
		
		// 5) Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
		// A seguir, calcule e mostre o valor da conta a pagar.
		
		Scanner scan = new Scanner(System.in);
		
		double cachorroQuente = 4.00;
		double xSalada = 4.50;
		double xBacon = 5.00;
		double torradaSimples = 2.00;
		double refrigerante = 1.50;
		
		System.out.println("TABELA DE PEDIDOS\n[1] Cachorro-Quente: R$ 4,00\n[2] X-Salada: R$ 4,50\n[3] X-Bacon: R$ 5,00\n[4] Torrada Simples: R$ 2,00\n[5] Refrigerante: R$ 1,50\n");
		
		System.out.print("Selecione a opção do cardápio: ");
		int num = scan.nextInt();
		System.out.println("Quantidade: ");
		int quant = scan.nextInt();
		
		if (num == 1) {
			double totalPagar = quant * cachorroQuente;
			System.out.println(quant + "Cachorro-Quente");
			System.out.printf("Total a pagar é: R$ %.2f%n", totalPagar);
		} else if (num == 2) {
			double totalPagar = quant * xSalada;
			System.out.println(quant + " X-Salada");
			System.out.printf("Total a pagar é: R$ %.2f", totalPagar);
			
		} else if (num == 3) {
			double totalPagar = quant * xBacon;
			System.out.println(quant + " X-Bacon");
			System.out.printf("Total a pagar é: R$ %.2f", totalPagar);
			
		} else if (num == 4) {
			double totalPagar = quant * torradaSimples;
			System.out.println(quant + " torradaSimples");
			System.out.printf("Total a pagar é: R$ %.2f", totalPagar);
			
		} else if (num == 5) {
			double totalPagar = quant * refrigerante;
			System.out.println(quant + " Refrigerante");
			System.out.printf("Total a pagar é: R$ %.2f", totalPagar);
			
		} else {
			System.out.println("Opção inválida.\nFIM");
		}
		
		scan.close();

	}

}
