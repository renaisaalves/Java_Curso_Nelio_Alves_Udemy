package exercicios;

import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String name = scan.next();
		System.out.printf("Boa menina, %s.", name);
		scan.close();
	}

}