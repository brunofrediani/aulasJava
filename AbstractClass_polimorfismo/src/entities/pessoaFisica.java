package entities;

public class pessoaFisica extends contribuintes {

	private Double planoSaude;

	public pessoaFisica(String name, Double rendaAnual, Double planoSaude) {
		super(name, rendaAnual);
		this.planoSaude = planoSaude;
	}

	public Double getplanoSaude() {
		return planoSaude;
	}

	

	public void setplanoSaude(Double planoSaude) {
		this.planoSaude = planoSaude;
	}

	@Override
	public Double impostos() {
		if (getRendaAnual() < 20000.0) {
			return getRendaAnual() * 0.15 - planoSaude * 0.5;
		} else {
			return getRendaAnual() * 0.25 - planoSaude * 0.5;
		}
	}

}
