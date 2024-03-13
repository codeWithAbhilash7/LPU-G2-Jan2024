package com.core.utilityclasses;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateClassDemo {

	public static void main(String[] args) {
		// date();
		// time();
		
		dateTime();
	}

	private static void dateTime() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// d - day
		// M - month
		// y - year
		// H - hour
		// m - minutes
		// s - seconds
		// E - weekday
		DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a dd-MMM-yyyy ");
		System.out.println(df.format(now));
	}

	private static void time() {
		LocalTime now = LocalTime.now();
		System.out.println("now = " + now);

		LocalTime zoneId = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println("Zone ID () = " + zoneId);
		
		LocalTime of = LocalTime.of(16, 48, 27);
		System.out.println("time of = " + of);

		LocalTime parse = LocalTime.parse("19:34:15");
		System.out.println("parse = " + parse);

		System.out.println("\nnow.isBefore(zoneId) = " + now.isBefore(zoneId));
		System.out.println("now.isAfter(parse) = " + now.isAfter(parse));

		System.out.println("\nnow.plusHours(2) = " + now.plusHours(2));
		System.out.println("now.plusMinutes(25) = " + now.plusMinutes(25));
		System.out.println("now.plusSeconds(68) = " + now.plusSeconds(68));
		
		System.out.println("\nnow.minusHours(2) = " + now.minusHours(2));
		System.out.println("now.minusMinutes(25) = " + now.minusMinutes(25));
		System.out.println("now.minusSeconds(68) = " + now.minusSeconds(68));

		Duration d = Duration.between(now, zoneId);
		System.out.println("Duration between now and zone id = " + d);
	}

	static void date() {
		LocalDate today = LocalDate.now();
		System.out.println("Today = " + today);

		LocalDate zoneId = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println("Zone ID () = " + zoneId);

		LocalDate indendanceDay = LocalDate.of(1947, 8, 15);
		System.out.println("Indendance Day = " + indendanceDay);

		LocalDate xMas = LocalDate.parse("2023-12-25");
		System.out.println("X-Mas = " + xMas);

		System.out.println("Is Leap year = " + today.isLeapYear());

		System.out.println("today.isBefore(xMas) = " + today.isBefore(xMas));
		System.out.println("today.isAfter(xMas) = " + today.isAfter(xMas));

		System.out.println("plus 10 days = " + today.plusDays(10));
		System.out.println("plus 2 months = " + today.plusMonths(2));
		System.out.println("plus 1 years = " + today.plusYears(1));

		System.out.println("minus 15 days = " + today.minusDays(15));
		System.out.println("minus 6 months = " + today.minusMonths(6));
		System.out.println("minus 3 years = " + today.minusYears(3));

		LocalDate startDate = LocalDate.of(2024, 1, 10);
		Period p = Period.between(today, startDate);
		System.out.println("Period between start date and today = " + p);
	}

}
