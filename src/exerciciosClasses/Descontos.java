package exerciciosClasses;

public class Descontos {
	
	private String nome;
	private double salarioBruto;
	private String tipoRegime;
	private double salarioLiquido;
	public double salarioMinimo = 1518.00;
	private double impostoContribuicao;
	private double impostoRenda;
	
	public Descontos() {
	}
	
	public Descontos(String nome, double salarioBruto, String tipoRegime) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.tipoRegime = tipoRegime;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
	
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public String getTipoRegime() {
		return tipoRegime;
	}
	
	public void setTipoRegime(String tipoRegime) {
		this.tipoRegime = tipoRegime;
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	
	public double getSalarioMinimo() {
		return salarioMinimo;
	}
	
	public void setSalarioMinimo(double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	
	public double getImpostoContribuicao() {
		return impostoContribuicao;
	}

	public double getImpostoRenda() {
		return impostoRenda;
	}
	//MÉTODOS
	
	public double impostoContribuicao() {
		if (tipoRegime == "CLT") {
			
		} else if (tipoRegime == "ESTATUTARIO") {
			
		} else {
			
		}
	return impostoContribuicao;
	}
	
	public double impostoRenda() {
		if (salarioBruto <= 1903.98) {
			impostoRenda = 0.0;
		}
	return impostoRenda;
	}
}


