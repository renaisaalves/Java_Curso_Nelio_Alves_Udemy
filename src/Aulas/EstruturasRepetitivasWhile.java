package Aulas;

import java.util.Scanner;

public class EstruturasRepetitivasWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int soma = 0;
		
		while (num != 0){
			soma = soma + num;
			num = scan.nextInt();
		}
		
		System.out.println("Soma: " + soma);
		
		scan.close();
	}

}
