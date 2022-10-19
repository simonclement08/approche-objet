package listes;

public enum Continent {

	AMERIQUE("Amérique"), EUROPE("Europe"), ASIE("Asie"), AFRIQUE("Afrique"), OCEANIE("Océanie");

	private String libelle;

	private Continent(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
