package classes;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		double salarioLiquido = salarioBruto - imposto;
		return salarioLiquido;
	}
	
	public double salarioAtualizado(double porcentagem) {
		double aumento = porcentagem * salarioBruto / 100;
		double salarioAtualizado = aumento + salarioLiquido();
		return salarioAtualizado;
	}
	

}
