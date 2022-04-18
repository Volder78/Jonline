package by.jonline.oop.calendar.main;

import by.jonline.oop.calendar.entity.Month;
import by.jonline.oop.calendar.view.View;

public class Main {
	
	public static void main(String[] args) {
		
		View view = new View();
		
		view.printHolidays(Month.JULY);
		view.printWeekends(Month.JULY, 22);
		
	}

}
