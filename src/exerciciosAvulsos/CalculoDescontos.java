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
		System.out.print("Salário bruto mensal: R$ ");
		double salarioBruto = scan.nextDouble();
		System.out.print("Tipo de regime: ");
		String tipoRegime = scan.next().toUpperCase();
		
		Descontos pessoa = new Descontos(nome, salarioBruto, tipoRegime);
		
		System.out.println("\nNome: " + pessoa.getNome());
		System.out.println("Salário Bruto: R$" + pessoa.getSalarioBruto());
		System.out.println("Tipo de regime: " + pessoa.getTipoRegime());
		System.out.printf("Imposto de contribuição: R$ %n");
		System.out.printf("Imposto de Renda: R$ %.2f%n", pessoa.impostoRenda());
		System.out.println("Percentual da alíquota IR: " + pessoa.aliquotaIR);
		System.out.println("Salário Líquido: R$");
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
