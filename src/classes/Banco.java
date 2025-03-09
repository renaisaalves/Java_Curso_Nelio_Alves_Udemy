package classes;

public class Banco {
	
	private int numConta;
	private String nomeTitular;
	char respDeposito;
	
	public Banco() {
	}
	
	public Banco(int numConta, String nomeTitular, char respDeposito) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.respDeposito = respDeposito;
	}
	
	public Banco(int numConta, String nomeTitular) {
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		
	}
	
	public char Deposito(char respDeposito) {
		if (respDeposito != 's' && respDeposito != 'n') {
			System.out.print("");
		}
		return respDeposito;
	}

}
