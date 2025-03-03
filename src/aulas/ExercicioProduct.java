package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.Product;

public class ExercicioProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Product produto = new Product();
		
		System.out.print("Nome do produto: ");
		produto.name = scan.nextLine();
		System.out.print("Preço: ");
		produto.price = scan.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantity = scan.nextInt();
		
		System.out.println(produto.toString());
		
		scan.close();

	}

}
