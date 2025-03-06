package classes;

public class INSS {
	
	public int categoriaContribuinte;
	public int aliquota;
	public double salarioMinimo = 1518.00;
	
	public double calculadora20(double salario){
        double taxaContribuicao = aliquota * salario / 100;
        return taxaContribuicao;
        }     

	public double calculadora() {
        double taxaContribuicao = aliquota * salarioMinimo / 100;
        return taxaContribuicao;
        }


}


/* public double calculadora(double salario){
 * 		if (aliquota == 20){
 * 			taxaContribuicao = aliquota * salario / 100;
 *      } else {
 *      	taxaContribuicao = aliquota * salarioMinimo / 100;
 *      }
 *      return taxaContribuicao;
 * }*/
 