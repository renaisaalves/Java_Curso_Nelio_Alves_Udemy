package classes;

public class ProductUsandoConstrutor {
	
		public String name;
		public double price;
		public int quantity;
		
		//Construtor personalizado 
		public ProductUsandoConstrutor(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		//Sobrecarga = Construtores com o mesmo nome, mas com parâmetros diferentes
		public ProductUsandoConstrutor(String name, double price) {
			this.name = name;
			this.price = price;
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
