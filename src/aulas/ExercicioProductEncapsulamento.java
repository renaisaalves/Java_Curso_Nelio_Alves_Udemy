package aulas;

import java.util.Locale;
import java.util.Scanner;

import classes.ProductEncapsulamento;

public class ExercicioProductEncapsulamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome do produto: ");
		String name = scan.nextLine();
		
		System.out.print("Preço: ");
		double price = scan.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		int quantity = scan.nextInt();
		
		ProductEncapsulamento produto = new ProductEncapsulamento(name, price, quantity); // construtor personalizado com parâmetros
		
		System.out.println(produto.toString());
		
		produto.setName("Computador"); // set = modificar o atributo "Name"
		System.out.print("Atualizar nome: " + produto.getName()); // get = exibir/acessar o atributo "Name"
		
		produto.setPrice(1500.00);
		System.out.print("Atualizar nome: " + produto.getPrice());
		
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
