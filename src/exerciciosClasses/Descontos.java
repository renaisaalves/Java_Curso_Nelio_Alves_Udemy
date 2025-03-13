package exerciciosClasses;

public class Descontos {
	
	private String nome;
	private double salarioBruto;
	private String tipoRegime;
	private double salarioLiquido;
	public int aliquotaContribuicao;
	private double descontoAliquota;
	public int aliquotaIR;
	private double descontoIR;
	
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
	
	public int getAliquotaContribuicao() {
		return aliquotaContribuicao;
	}
	
	public void setAliquotaContribuicao(int aliquotaContribuicao) {
		this.aliquotaContribuicao = aliquotaContribuicao;
	}
	
	public double getDescontoAliquota() {
		return descontoAliquota;
	}
	
	public int getAliquotaIR() {
		return aliquotaIR;
	}
	
	public void setAliquotaIR(int aliquotaIR) {
		this.aliquotaIR = aliquotaIR;
	}
	
	public double getDescontoIR() {
		return descontoIR;
	}
	
	public void setDescontoIR(double descontoIR) {
		this.descontoIR = descontoIR;
	}

}


