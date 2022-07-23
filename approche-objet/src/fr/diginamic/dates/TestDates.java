package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
	    Date dateDuJour = new Date();
	    
	    Date date = new Date(116,5,19, 23,59,31);
	    
	   System.out.println(date);
	    
		System.out.println(date.getDate()+"-"+date.getMonth()+"-"+date.getYear()+" "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
	}

}
