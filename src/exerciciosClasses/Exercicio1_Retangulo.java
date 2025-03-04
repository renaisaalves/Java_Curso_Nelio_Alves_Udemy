package exerciciosClasses;

import java.util.Locale;
import java.util.Scanner;
import classes.Retangulo;

public class Exercicio1_Retangulo {

	public static void main(String[] args) {
		
		// 1) Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela o valor de
		// sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangulo calRetangulo = new Retangulo();
		
		System.out.print("Calculando medidas de um Retângulo\nLargura: ");
		calRetangulo.width = scan.nextDouble();
		
		System.out.print("Altura: ");
		calRetangulo.height = scan.nextDouble();
		
		calRetangulo.retorno();
		
		scan.close();

	}

}
