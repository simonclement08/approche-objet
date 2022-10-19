package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 05, 19, 23, 59, 30);
		Date date = calendar.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formateur.format(date));
		
		Calendar calendar2 = Calendar.getInstance();
		Date date2 = calendar2.getTime();
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:s");
		System.out.println(formateur2.format(date2));
		
		SimpleDateFormat formateurFrance = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
		SimpleDateFormat formateurRusse = new SimpleDateFormat("EEEE dd MMMM yyyy", new Locale("ru", "RU"));
		SimpleDateFormat formateurChinois = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINESE);
		SimpleDateFormat formateurAllemand = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
		System.out.println(formateurFrance.format(date2));
		System.out.println(formateurRusse.format(date2));
		System.out.println(formateurChinois.format(date2));
		System.out.println(formateurAllemand.format(date2));
	}

}
