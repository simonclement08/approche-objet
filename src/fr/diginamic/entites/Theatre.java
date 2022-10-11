package fr.diginamic.entites;

public class Theatre {
	
	private String nom;
	private int capaciteMax;
	private int totalClient;
	private double recette;
	
	public Theatre(String nom, int capaciteMax, int totalClient, double recette) {
		this.nom = nom;
		this.capaciteMax = capaciteMax;
		this.totalClient = totalClient;
		this.recette = recette;
	}
	
	public void incrire(int nbClients, double price) {
		if(totalClient + nbClients > capaciteMax) {
			System.out.println("Il n'y a plus assez de place !");
		} else {
			totalClient += nbClients;
			recette += nbClients * price;
		}
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getCapaciteMax() {
		return capaciteMax;
	}
	
	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}
	
	public int getTotalClient() {
		return totalClient;
	}
	
	public void setTotalClient(int totalClient) {
		this.totalClient = totalClient;
	}
	
	public double getRecette() {
		return recette;
	}
	
	public void setRecette(double recette) {
		this.recette = recette;
	}
}
