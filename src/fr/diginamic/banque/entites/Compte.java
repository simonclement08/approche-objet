package fr.diginamic.banque.entites;

public class Compte {

	private String numero;
	private double solde;
	
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Compte : " + this.getNumero() + ", Solde : " + this.getSolde();
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
}
