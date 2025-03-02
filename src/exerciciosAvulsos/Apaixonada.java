package exerciciosAvulsos;

import java.util.Scanner;

public class Apaixonada {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Você está apaixonada?\nResposta:");
		char resposta = scan.next().charAt(0);
		
		cupidoApaixonado(resposta);
		
		
		scan.close();
	}

	public static void cupidoApaixonado(char amor) {
		if (amor == 's' || amor == 'S') {
			System.out.println("Você está apaixonada");
		} else {
			System.out.println("Você não está apaixonada.");
		}
	}

}
