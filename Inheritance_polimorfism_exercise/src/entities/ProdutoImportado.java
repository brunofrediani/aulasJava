package entities;

public class ProdutoImportado extends Produto {

	private Double taxaAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preço, Double taxaAlfandega) {
		super(nome, preço);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double precoTotal() {
		return getPreço() + taxaAlfandega;
	}

	@Override
	public String etiqueta() {
		return getNome() 
				+ " $" 
				+ precoTotal()
				+ " (Taxa de importação: " 
				+  getTaxaAlfandega()
				+")";
	}

}
