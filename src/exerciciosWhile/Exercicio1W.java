package exerciciosWhile;

import java.util.Scanner;

public class Exercicio1W {

	public static void main(String[] args) {
		//1) Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Crie uma senha: ");
		int senha = scan.nextInt();
		
		System.out.print("Insira a senha: ");
		int senhaInserida = scan.nextInt();
		
		while (senhaInserida != senha) {
			System.out.print("Senha inválida. Digite novamente: ");
			senhaInserida = scan.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		scan.close();

	}

}
