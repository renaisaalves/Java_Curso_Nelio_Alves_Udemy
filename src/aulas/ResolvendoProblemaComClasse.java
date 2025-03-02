package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.ClasseTriangulo;

public class ResolvendoProblemaComClasse {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		ClasseTriangulo x, y;
		x = new ClasseTriangulo();
		y = new ClasseTriangulo();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle X area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		scan.close();

	}

}
