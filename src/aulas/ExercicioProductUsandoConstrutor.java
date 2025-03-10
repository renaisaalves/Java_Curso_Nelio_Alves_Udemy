package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.ProductUsandoConstrutor;

public class ExercicioProductUsandoConstrutor {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		//ProductUsandoConstrutor produto = new ProductUsandoConstrutor(); Construtor padrão (sem parâmetros definidos)
		System.out.print("Nome do produto: ");
		String name = scan.nextLine();
		
		System.out.print("Preço: ");
		double price = scan.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		int quantity = scan.nextInt();
		
		ProductUsandoConstrutor produto = new ProductUsandoConstrutor(name, price, quantity); // construtor personalizado com parâmetros
		
		System.out.println(produto.toString());
		
		System.out.print("\nAdicionar produto: ");
		int addProduto = scan.nextInt();
		produto.addProducts(addProduto);
		System.out.println(produto.toString());
		
		System.out.print("\nRemover produto: ");
		int removeProduto = scan.nextInt();
		produto.removeProducts(removeProduto);
		System.out.println(produto.toString());
		
		scan.close();

	}

}
