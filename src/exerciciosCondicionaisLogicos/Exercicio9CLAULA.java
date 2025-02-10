package exerciciosCondicionaisLogicos;

import java.util.Scanner;

public class Exercicio9CLAULA {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PLANO BÁSICO TELEFONE\nR$50,00 por 100 minutos!\nAo exceder esse limite, será cobrado uma taxa de R$2,00 por minuto consumido");
		
		System.out.print("Consumo: ");
		int minutosFalados = scan.nextInt();
		
		if (minutosFalados <= 100) {
			System.out.printf("Preço: R$50,00%n");
		} else {
			double preco = ((minutosFalados - 100) * 2) + 50;
			double precoExcesso = preco - 50;
			System.out.printf("Preço: R$%.2f%nPreço por excesso R$%.2f%n", preco, precoExcesso);
			
		}
		scan.close();
		
		//EM CONSTRUÇÃO

	}

}
