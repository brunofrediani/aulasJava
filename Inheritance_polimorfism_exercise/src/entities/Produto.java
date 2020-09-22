package entities;

public class Produto {

	private String nome;
	private Double preço;

	public Produto() {
		super();
	}

	public Produto(String nome, Double preço) {
		super();
		this.nome = nome;
		this.preço = preço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public String etiqueta() {
		return nome 
				+ " $" 
				+ String.format("%.2f", preço);

	}
	

}
