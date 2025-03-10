package classes;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
	
	private int numConta;
	private String nomeTitular;
	private double deposito = 0.0;
	
	public Banco() {
	}
	
	public Banco(int numConta, String nomeTitular, char respDeposito) {
		
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		if (respDeposito == 's' || respDeposito == 'S') {
			this.deposito = valorDeposito();
		}
		
	}
	
	public Banco(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}
	
	public static double valorDeposito() {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Valor do depósito R$: ");
		double valor = scan.nextDouble();
		scan.close();
		return valor;
	} 
	
	public int getnumConta() {
		return numConta;
	}
	
	public String getnomeTitular() {
		return nomeTitular;
	}
	
	public double getdeposito() {
		return deposito;
	}
	
	public void setdeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public void exibirTela() {
		System.out.printf("%nNúmero da conta: %d | Titular: %s | Valor depositado R$: %.2f%n", numConta, nomeTitular, deposito);
	}
	

}
