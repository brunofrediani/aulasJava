package entities;

public class pessoaJuridica extends contribuintes {

	private Integer nFunc;
	

	public pessoaJuridica(String name, Double rendaAnual, Integer nFunc) {
		super(name, rendaAnual);
		this.nFunc = nFunc;
	}

	public Integer getnFunc() {
		return nFunc;
	}

	public void setnFunc(Integer nFunc) {
		this.nFunc = nFunc;
	}

	@Override
	public Double impostos() {
		if (nFunc > 10){
		return getRendaAnual() * 0.14;
		}
		else {
		return getRendaAnual() * 0.16;
	}
	
	}
	
	
}
