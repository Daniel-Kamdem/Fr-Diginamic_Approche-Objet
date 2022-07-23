package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
	
Calendar cal = Calendar.getInstance(Locale.FRANCE);
		
SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");

	  //  Date dateDuJour = new Date();
	    
	    Date date = new Date(116,4,19, 23,59,31);
	    
 String dateFormatee = formateur.format(date);
	    
		System.out.println(dateFormatee);
	   
	    
		//System.out.println(date.getDate()+"-"+date.getMonth()+"-"+date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
		
		
		
		
		
Calendar cal1 = Calendar.getInstance(Locale.FRANCE);
		
cal1.set(Calendar.YEAR, 2022);
	    
SimpleDateFormat formateur1 = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss");
	   
Date date1 = cal1.getTime();
	   //System.out.println(date1);
	   
	   String dateFormatee1 = formateur1.format(date1);
	    
		System.out.println(dateFormatee1);
		
		
		
		
Calendar cal2 = Calendar.getInstance ();
		
		cal1.set(Calendar.YEAR, 2022);
			    
		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MMMM/dd HH:mm:ss" , new Locale("ru", "RU"));
			   
		Date date2 = cal1.getTime();
			   //System.out.println(date2);
			   
			   String dateFormatee2 = formateur2.format(date1);
			    
				System.out.println(dateFormatee2);
	}

}
