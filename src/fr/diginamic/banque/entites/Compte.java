package fr.diginamic.banque.entites;

public class Compte {

	String numero;
	double solde;
	
	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "Compte : " + this.numero + ", Solde : " + this.solde;
	}

}
