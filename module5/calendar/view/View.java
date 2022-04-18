package by.jonline.oop.calendar.view;

import java.util.List;

import by.jonline.oop.calendar.entity.DayOfWeek;
import by.jonline.oop.calendar.entity.Holiday;
import by.jonline.oop.calendar.entity.Month;
import by.jonline.oop.calendar.logic.CalendarLogic;

public class View {
	
	CalendarLogic logic = new CalendarLogic();
	DayOfWeek[] weekDays = DayOfWeek.values();
	
	
	public void printHolidays(Month month) {
		
		List<Holiday> holidays = CalendarLogic.holidays(month);
		
		System.out.println("Holiday(s) in " + month + ":");
		
		for(Holiday h : holidays) {
			
			System.out.println(h.toString());
		
		}
		System.out.println(logic.numberOfHolidays(month) + " holiday(s) in " + month);
		
		
		
	}
	
	public void printWeekends(Month month, int year) {
		System.out.println("\nWeekends in " + month + ":");
		System.out.println(logic.weekends(month, year).size() + " weekends");
	}
	
	
}

