package fr.diginamic.testexceptions;

import listes.Continent;
import listes.Ville;

public class TestReflectionUtils {

	public static void main(String[] args) {
		Ville ville = new Ville("Reims", 45000, Continent.EUROPE);
		
		try {
			ReflectionUtils.afficherAttributs(ville);
			ReflectionUtils.afficherAttributs(null);
		} catch (ReflectionException e) {
			System.err.println(e.getMessage());
		}
		catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
