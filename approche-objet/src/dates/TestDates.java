package dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.of(2022, 8, 15);
		System.out.println(date.getDayOfYear());

		LocalDate date2 = date.plus(2, ChronoUnit.DAYS);
		System.out.println(date2);
		
		LocalTime time1 = LocalTime.of(10, 10, 10);
		LocalTime time  = LocalTime.of(8, 10, 20);
	LocalDateTime dateTime = LocalDateTime.of(date2,time);
	
	Duration duree = Duration.between(time, time1);
	
	
	
	System.out.println(dateTime);
	
	String  chaine = "2022-08-15T08:12:57" ;
		
	}

}
