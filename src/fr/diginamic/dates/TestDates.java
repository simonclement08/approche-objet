package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));
		
		Date date2 = new Date(116, 04, 19, 23, 59, 30);
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:s");
		System.out.println(formateur2.format(date2));
		
		Date date3 = new Date();
		System.out.println(formateur2.format(date3));
	}

}
