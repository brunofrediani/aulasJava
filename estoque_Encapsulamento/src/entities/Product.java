package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}
	
	
	public double setPrice(double price) {
		this.price= price;
		return price;
	}
	
	
	
	

	public Product() {
		// Se quiser posso continuar utilizando o construtor simples, o padrão
	}
	
	
	
	/* Esse product é o construtor customizado, ele vai ser chamado após a leitura dos dados
	 * no Program.java - Aqui é utilizado pra previnir de iniciar uma instância vazia
	 */
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	/*Sobrecarga,ele tem o mesmo nome do de cima, mas se quiser posso passar somente dois parâmetros
	 * e o terceiro iniciar com 0
	 *caso for usar essa sobrecarga remover a entrada do int quantity no código
	 */
	 
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0; // opcional porque as variáveis já iniciam 0 por padrão
	}	

	public double totalValueInStock() {

		return price * quantity;
	}

	public void addProducts(int quantity) {

		this.quantity += quantity;

		/*
		 * esse this é pra dizer que essa variável quantity é a da classe product,
		 * enquanto a outra var quantity é a que vai receber o valor que formos inserir
		 */
	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity;
	}

	public String toString() {

		return "Product Data: " 
		+ name 
		+ " , $" 
		+ String.format("%.2f", price) 
		+ ", " 
		+ quantity 
		+ " units"
		+ ", Total: $" + String.format("%.2f", totalValueInStock());

	}

}
