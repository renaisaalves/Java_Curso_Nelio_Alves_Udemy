package classes;

import java.util.Scanner;

public class INSS {
	
	public int categoriaContribuinte;
	public int aliquota;
	public double salarioMinimo = 1518.00;
	double taxaContribuicao;
	
	public double calculadora(){
		double taxaContribuicao;
		
		Scanner scan = new Scanner (System.in);
	
	  		if (aliquota == 20){
	  			System.out.print("Salário de contribuição: R$");
	  			double salario = scan.nextDouble();
	  			taxaContribuicao = aliquota * salario / 100;
	  			scan.close();
	       } else {
	       		taxaContribuicao = aliquota * salarioMinimo / 100;
	       }
	       return taxaContribuicao;
	}
}
