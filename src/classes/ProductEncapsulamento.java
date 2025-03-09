package classes;

public class ProductEncapsulamento {
	
	//Aplicação do Encapsulamento (quando os atributos não podem ser acessados por outras Classes. Isso protege os atributos de modificações)
	private String name; 
	private double price;
	private int quantity;
	
	//Construtor padrão (sem parâmetros)
	public ProductEncapsulamento() {
	}
	
	//Construtor personalizado (com parâmetros)
	public ProductEncapsulamento(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Sobrecarga = É quandos os métodos possuem o mesmo nome, mas com parâmetros diferentes (no caso é sobrecarga de construtores)
	public ProductEncapsulamento(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	//Encapsulamento get (acessar o atributo da Classe)
	public String getName() {
		return name;
	}
	
	//Encapsulamento set (modificar/alterar o atributo da Classe)
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity(int quantity) {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}   //this serve para fazer referência ao atributo/objeto e não ao parâmetro;
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		
	}
	
	public String toString() {
		return "Produto: " + name.toUpperCase() + ", Preço: R$" + price + ", Quantidade: " + quantity + ", Total R$: " + totalValueInStock();
	}

}
