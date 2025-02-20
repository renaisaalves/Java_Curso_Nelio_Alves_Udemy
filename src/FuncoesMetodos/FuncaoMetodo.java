package FuncoesMetodos;

import java.util.Scanner;

public class FuncaoMetodo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String name = scan.next();
		
		int resultado = media(num1, num2);
		exibirNaTela(name, resultado);
		
		int retornandoValor = logicaAritmetica(5, 5, 5, 5, 5);
		exibirNaTela(name, retornandoValor);
		
		scan.close();
	}
	
	public static int media(int x, int y) {
		int mediaNum = (x + y) / 2;
		return mediaNum;
	}
	
	public static void exibirNaTela(String name, int result) {
		System.out.println("Estou tentando criar funções " + name + "!");
		System.out.println("Será que está dando certo?\nMédia: " + result);
	}
	
	public static int logicaAritmetica(int num0, int num1, int num2, int num3, int num4) {
		int result = num0 + num1 / num2 + num3 * num4;
		return result;
	}

}

// USANDO PROGRAMINHA COM FUNÇÃO PELA PRIMEIRA VEZ