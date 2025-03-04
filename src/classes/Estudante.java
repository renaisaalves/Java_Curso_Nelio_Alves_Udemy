package classes;

public class Estudante {
	
	public String nome;
	public int primeiroTrimestre;
	public int segundoTrimestre;
	public int terceiroTrimestre;
	
	public int media() {
		int media = primeiroTrimestre + segundoTrimestre + terceiroTrimestre / 3;
		return media;
	}
	
	public String resultado() {
		if (media() > 50) {
			return "\nNome: " + nome + "\nNota final do aluno no ano: " + media() + " pontos\nResultado: APROVADO";
		} else {
			int falta = 50 - media();
			return "\nNome: " + nome + "\nNota final do aluno no ano: " + media() + " pontos\nResultado: REPROVADO"
			+ "\nFaltam " + falta + " pontos para atingir a nota mínima (50)." ;
		}
	}

}
