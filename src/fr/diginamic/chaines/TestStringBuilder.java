package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		long debut = System.currentTimeMillis();
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= 100000; i++) {
			builder.append(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes : " + (fin-debut));
		
		debut = System.currentTimeMillis();
		String string = "";
		for (int i = 1; i <= 100000; i++) {
			string = string + i;
		}
		fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes : " + (fin-debut));

	}

}
