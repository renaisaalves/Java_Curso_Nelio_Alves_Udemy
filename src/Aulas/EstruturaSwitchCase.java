package Aulas;

import java.util.Scanner;

public class EstruturaSwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dia: ");
		int x = scan.nextInt();
		String dia;
		
		if (x == 1) {
			dia = "Domingo";
		} else if (x == 2) {
			dia = "Segunda-feira";
		} else if (x == 3) {
			dia = "Terça-feira";
		} else if (x == 4) {
			dia = "Quarta-feira";
		} else if (x == 5) {
			dia = "Quinta-feira";
		} else if (x == 6) {
			dia = "Sexta-feira";
		} else if (x == 7) {
			dia = "Sábado";
		} else {
			dia = "Valor inválido";
		}
		
		System.out.println("Dia da semana: " + dia);
		
		//UTILIZANDO SWITCH-CASE
		
		int y = scan.nextInt();
		String day;
		
		switch (y) {
		case 1:
			day = "Domingo";
			break; //OBRIGATÓRIO
		case 2:
			day = "Segunda-feira";
			break;
		case 3:
			day = "Terça-feira";
			break;
		case 4:
			day = "Quarta-feira";
			break;
		case 5:
			day = "Quinta-feira";
			break;
		case 6:
			day = "Sexta-feira";
			break;
		case 7:
			day = "Sábado";
		default: //PADRÃO (caso a resposta não seja nenhuma acima)
			day = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + day);
		
		scan.close();

	}

}
