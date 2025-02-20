package aulas;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter with three numbers: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int higher = max(a, b, c); 
		//os 3 números informados pelo usuário que foram armazenados dentro das variáveis a, b, e c vão entrar no parâmetro da função max criada logo abaixo
		
		showResult(higher); //classe criada para exibir o resultado da função max
		
		scan.close();
	}
	
	//CRIANDO UMA FUNÇÃO PELA PRIMEIRA VEZ
	
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
	//Toda função é criada abaixo da função principal "public static void main". Uma função não pode ser criada dentro da função principal "public static void main". 
	//O objetivo da função max é processar o maior número entre os 3 digitados pelo usuário. Então a função max vai receber como argumento os 3 números e a partir daí a lógica é desenvolvida (igual como fazíamos dentro da função principal "public static void main"). 
	//Ao final da instrução lógica desenvolvida, a palavra "return" (retorno) vai retornar a varável aux, que serviu para armazenar o maior valor.
	//Toda função possui uma funcionalidade específica. Ela pode ser chamada dentro de um programa a qualquer momento (verde-limão), e pode ou não receber parâmetros/argumentos. Nesse exemplo, a função max pode receber 3 argumentos. 
	//Repare que "a, b e c" são variáveis que foram criadas para armazenar valores numéricos do tipo int, mas também é possível colocar números diretamente na função. Isso significa que não necessariamente precisa ser só variáveis a servirem como parâmetros/argumentos, valores diretos também (exemplo: 3, 5 e 10) [desde que atendendo o tipo correto].
	
	//A segunda função tem objetivo de apenas imprimir na tela um argumento, por isso ela é do tipo (void). 

}
