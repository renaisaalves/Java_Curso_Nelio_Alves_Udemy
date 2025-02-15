package aulas;

import java.util.Scanner;

public class OperadoresDeAtribuicaoAcumulativa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int minutos = scan.nextInt();
		
		double conta = 50.00;
		if  (minutos  > 100) {
			conta += (minutos - 100) * 2.0; // conta = conta + pode ser substituído por conta += conta
			
		}
		
		System.out.printf("Valor da conta: R$%.2f%n", conta);
		
		scan.close();

	}

}

//OPERADORES DE ATRIBUIÇÃO ACUMULATIVA

/* É quando a variável vai somar, dividir, multiplicar com outra variável e armazenar nela mesma
 * a += b ou a = a + b
 * a -= b
 * a *= b
 * a /= b
 * a %= b */
