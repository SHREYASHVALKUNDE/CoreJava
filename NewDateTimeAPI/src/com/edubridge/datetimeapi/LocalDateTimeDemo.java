package com.edubridge.datetimeapi;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//program to demonstrate on LocalDate, LocalDateTime and LocalTime
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println("The Current Date is: "+d);
		
		LocalTime t=LocalTime.now();
		System.out.println("The Current time is: "+t);
		
		LocalDateTime l=LocalDateTime.now();
		System.out.println("The Current date and time is: "+l);

	}

}
