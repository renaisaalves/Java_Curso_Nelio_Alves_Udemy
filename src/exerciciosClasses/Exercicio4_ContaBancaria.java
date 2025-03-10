package exerciciosClasses;

import java.util.Locale;
import java.util.Scanner;
import classes.Banco;

public class Exercicio4_ContaBancaria {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número da conta: ");
		int numConta = scan.nextInt();
		
		System.out.print("Titular: ");
		String nomeTitular = scan.nextLine();
		nomeTitular = scan.nextLine();
		
		System.out.print("Existe um depósito inicial? ");
		char respDeposito = scan.next().charAt(0);
		
		Banco rayssa = new Banco(numConta, nomeTitular, respDeposito);
		rayssa.exibirTela();
		
		System.out.printf("Nome do Titular: ", rayssa.getnomeTitular());
		rayssa.setdeposito(500.00);
		System.out.printf("Depósito: %.2f%n", rayssa.getdeposito());
		
		Banco henrique = new Banco(12012002, "Henrique", 's');
		henrique.exibirTela();
		
		System.out.printf("Nome do Titular: ", henrique.getnomeTitular());
		System.out.printf("Depósito: %.2f%n", henrique.getdeposito());
		
		scan.close();

	}

}
