package exerciciosClasses;

import java.util.Scanner;
import classes.Funcionario;

public class Exercicio2_Funcionario {
	
	public static void main(String[] args) {
		
		/* 2) Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário 
		 * com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. 
		 * Use a classe projetada abaixo. */
		
		Scanner scan = new Scanner(System.in);
		Funcionario objeto = new Funcionario();
		
		System.out.print("Nome: ");
		objeto.nome = scan.nextLine();
		
		System.out.print("Salário bruto: R$");
		objeto.salarioBruto = scan.nextDouble();
		
		System.out.print("Imposto: ");
		objeto.imposto = scan.nextDouble();
		
		System.out.printf("\nNome: %s%nSalário Líquido: R$%.2f%n", objeto.nome, objeto.salarioLiquido());
		
		System.out.print("\nDeseja adicionar aumento?\nIndique o valor: ");
		double porcentagem = scan.nextDouble();
		objeto.salarioAtualizado(porcentagem);
		
		System.out.printf("%nNome do funcionário: %s%nSalário Líquido com aumento: R$%.2f%n", objeto.nome, objeto.salarioAtualizado(porcentagem));
		
		scan.close();
		
	}

}
