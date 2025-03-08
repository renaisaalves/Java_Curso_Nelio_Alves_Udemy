package exerciciosAvulsos;

import java.util.Scanner;

import classes.Sangue;

public class TipoSanguineo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Sangue blood = new Sangue();
		
		
		System.out.println("Qual é o seu tipo sanguíneo?");
		blood.bloodType = scan.next().toUpperCase();
		
		System.out.println(blood.compatibilidade());
		System.out.print(blood.compatibilidadeSwitchCase());
		
		scan.close();
	}

}
