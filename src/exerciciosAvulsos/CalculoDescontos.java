package exerciciosAvulsos;

import java.util.Locale;
import java.util.Scanner;

import exerciciosClasses.Descontos;

public class CalculoDescontos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE DESCONTOS\n");
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		scan.next();
		System.out.print("Salário bruto mensal R$: ");
		double salarioBruto = scan.nextDouble();
		System.out.print("Tipo de regime: ");
		String tipoRegime = scan.next();
		
		Descontos desconto = new Descontos(nome, salarioBruto, tipoRegime);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
