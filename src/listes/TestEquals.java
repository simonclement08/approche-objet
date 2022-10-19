package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("New York", 400000);
		Ville ville2 = new Ville("New York", 400000);
		
		System.out.println("Même attributs avec equals : " + ville1.equals(ville2));
		System.out.println("Même attributs avec == : " + (ville1 == ville2));
		
		ville2.setHabitants(350000);
		System.out.println("Attributs différents avec equals : " + ville1.equals(ville2));
		System.out.println("Attributs différents avec == : " + (ville1 == ville2));
	}

}
