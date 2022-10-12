package fr.diginamic.formes;

public abstract class Forme {

	public abstract double calculerSurface();
	
	public abstract double calculerPerimetre();
	
	@Override
	public String toString() {
		return "Cette forme à un périmètre de " + calculerPerimetre() + "cm et une surface de " + calculerSurface() + "cm²";
	}
}
