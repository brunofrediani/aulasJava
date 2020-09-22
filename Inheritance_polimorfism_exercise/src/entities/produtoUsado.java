package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtoUsado extends Produto {
	
	
private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dtFabricacao;

	public produtoUsado() {
		super();
	}

	public produtoUsado(String nome, Double preço, Date dtFabricacao) {
		super(nome, preço);
		this.dtFabricacao = dtFabricacao;
	}

	@Override
	public String etiqueta() {
		return getNome() 
				+ " (usado): $"
				+ String.format("%.2f",getPreço()) 
				+ " (Data de fabricação: " 
				+ sdf.format(dtFabricacao) + ")";

	}	
}
