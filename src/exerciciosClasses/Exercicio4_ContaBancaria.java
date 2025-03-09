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
		
		System.out.print("Existe um depósito inicial? ");
		char respDeposito = scan.next().charAt(0);
		
		Banco registroConta = new Banco(numConta, nomeTitular, respDeposito);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();

	}

}
