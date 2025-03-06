package aulas;

import java.util.Scanner;

import classes.CalculoRaioVersao2;

import java.util.Locale;

public class MembrosEstaticosVersao2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		CalculoRaioVersao2 objeto = new CalculoRaioVersao2();
		
		System.out.print("Raio: ");
		double raio = scan.nextDouble();
		
		double c = objeto.circunferencia(raio);
		double v = objeto.volume(raio);
		
		System.out.printf("Raio: %.2f%n", c);
		System.out.printf("Circunferência: %.2f%n", v);
		System.out.printf("PI: %.5f%n", objeto.PI);
		
		scan.close();

	}

}
