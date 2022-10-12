package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
	private double nbJourTravail;
	private double remunerationJournalier;
	
	public Pigiste(String nom, String prenom, double nbJourTravail, double remunerationJournalier) {
		super(nom, prenom);
		this.nbJourTravail = nbJourTravail;
		this.remunerationJournalier = remunerationJournalier;
	}
	
	public void afficherDonnees() {
		super.afficherDonnees();
		System.out.println("Statut : Pigiste");
	}

	public double getSalaire() {
		return nbJourTravail * remunerationJournalier;
	}

	public double getNbJourTravail() {
		return nbJourTravail;
	}

	public void setNbJourTravail(double nbJourTravail) {
		this.nbJourTravail = nbJourTravail;
	}

	public double getRemunerationJournalier() {
		return remunerationJournalier;
	}

	public void setRemunerationJournalier(double remunerationJournalier) {
		this.remunerationJournalier = remunerationJournalier;
	}
}
