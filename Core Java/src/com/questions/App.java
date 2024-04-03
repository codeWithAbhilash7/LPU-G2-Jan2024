package com.questions;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Iterator;

public class App {

	/**
	 * prints the total number of weekends including start and end date
	 * 
	 * @param startDate
	 * @param endDate
	 */
	public static void calculateDays(LocalDate startDate, LocalDate endDate) {
		int totalWeekends = 0;
		int totalWeekdays = 0;

		LocalDate currentDay = startDate;
		for (; currentDay.isBefore(endDate); currentDay = currentDay.plusDays(1)) {

			DayOfWeek day = currentDay.getDayOfWeek();

			switch (day) {
			case SATURDAY:
			case SUNDAY:
				totalWeekends++;
				break;

			default:
				totalWeekdays++;
			}
		}

		System.out.println("Weekend count :: " + totalWeekends);
		System.out.println("Weekday count :: " + totalWeekdays);
	}

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2024, 3, 1);
		LocalDate end = LocalDate.of(2024, 3, 31);
		calculateDays(start, end);
	}

}
