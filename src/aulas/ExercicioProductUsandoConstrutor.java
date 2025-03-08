package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.ProductUsandoConstrutor;

public class ExercicioProductUsandoConstrutor {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Nome do produto: ");
		String name = scan.nextLine();
		
		System.out.print("Preço: ");
		double price = scan.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		int quantity = scan.nextInt();
		
		ProductUsandoConstrutor produto = new ProductUsandoConstrutor(name, price, quantity); // construtor definido
		
		System.out.print("Adicionar produto: ");
		int addProduto = scan.nextInt();
		produto.addProducts(addProduto);
		
		System.out.print("Remover produto: ");
		int removeProduto = scan.nextInt();
		produto.removeProducts(removeProduto);
		
		System.out.println(produto.toString());
		
		scan.close();

	}

}
