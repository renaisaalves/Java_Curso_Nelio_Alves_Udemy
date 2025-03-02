package classes;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}   //this serve para fazer referência ao atributo e não ao parâmetro;
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		
	}

}
