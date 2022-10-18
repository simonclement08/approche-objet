package fr.diginamic.recensement.entities;

public abstract class Territoire {
	protected String code;

	public Territoire(String code) {
		super();
		this.code = code;
	}
	
	public abstract int getPopulation();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
