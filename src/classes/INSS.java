package classes;

public class INSS {
	
	public int categoriaContribuinte;
	public int aliquota;
	public double salarioMinimo = 1518.00;
	double taxaContribuicao; // é obrigatório declarar que é pública?
	
	public double calculadora20(double salario){
	  			taxaContribuicao = aliquota * salario / 100;
	  			return taxaContribuicao;
	       } 

	public double calculadora() {
	       		taxaContribuicao = aliquota * salarioMinimo / 100;
	       		return taxaContribuicao;
	       }
	  		
	       
	}
 