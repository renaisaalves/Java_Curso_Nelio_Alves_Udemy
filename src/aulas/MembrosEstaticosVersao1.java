package aulas;

import java.util.Scanner;
import java.util.Locale;

public class MembrosEstaticosVersao1 {
	
	public static final double PI = 3.14159; //final significa que a constante não pode ser modificada/alterada de jeito nenhum
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Raio: ");
		double raio = scan.nextDouble();
		
		double c = circunferencia(raio);
		double v = volume(raio);
		
		System.out.printf("Raio: %.2f%n", c);
		System.out.printf("Circunferência: %.2f%n", v);
		System.out.printf("PI: %.5f%n", PI);
		
		scan.close();

	}
	
	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}

}
