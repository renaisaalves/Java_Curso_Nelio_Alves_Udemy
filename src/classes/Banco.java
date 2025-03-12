package classes;

import java.util.Locale;
import java.util.Scanner;

public class Banco {
	
	Scanner scan = new Scanner(System.in);
		
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
	
	public double valorDeposito() {
		Locale.setDefault(Locale.US);
		System.out.print("Depositar valor R$: ");
		double valor = scan.nextDouble();
		return valor;
	} 
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}
	
	public void addDeposito (double deposito) {
		this.deposito += deposito;
	}
	
	public void removeDeposito (double deposito) {
		this.deposito -= deposito;
		this.deposito -= 5.00;
	}
	
	public void exibirSaldo() {
		System.out.printf("%nNúmero da conta: %d | Titular: %s | Saldo atual R$: %.2f%n", getNumConta(), getNomeTitular(), getDeposito());
	}
	
	
}
