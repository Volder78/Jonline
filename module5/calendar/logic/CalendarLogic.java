package by.jonline.oop.calendar.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import by.jonline.oop.calendar.entity.Calendar;
import by.jonline.oop.calendar.entity.DayOfWeek;
import by.jonline.oop.calendar.entity.Holiday;
import by.jonline.oop.calendar.entity.Month;

public class CalendarLogic {

	private List<Calendar.Day> days = new ArrayList<Calendar.Day>();
	private Calendar calendar = new Calendar(days);

	public List<Calendar.Day> addDays(Month month) {
		List<Calendar.Day> cal = new ArrayList<Calendar.Day>();

		for (int day = 1; day <= month.getDayNumber(); day++) {
			cal.add(calendar.new Day(day));
		}
		return cal;

	}

	public static List<Holiday> holidays(Month month) {
		Holiday[] hol = Holiday.values();
		List<Holiday> stateHolidays = new ArrayList<Holiday>();

		for (Holiday h : hol) {
			if (h.getMonth().equals(month)) {
				stateHolidays.add(h);
			}
		}

		return stateHolidays;
	}

	public int numberOfHolidays(Month month) {
		return holidays(month).size();
	}

	public static int firstDayOfMonth(Month month, int year) {
		return (1 + month.getMonthCode() + yearCode(year)) % 7;

	}

	public static int yearCode(int year) { // 2 last digits of year
		return (6 + year + (year / 4)) % 7;
	}

	
	public Map<Integer, DayOfWeek> dayMap(Month month, int year) {

		int day = firstDayOfMonth(month, year);
		Map<Integer, DayOfWeek> weekdaysMap = new HashMap<Integer, DayOfWeek>();

		for (int i = 1; i <= month.getDayNumber(); i++) {
			weekdaysMap.put(i, DayOfWeek.values()[day]);
			day++;

			if (day == 7) {
				day = 0;
			}
			Calendar.Day d = calendar.new Day(i, DayOfWeek.values()[day], month);
			d.setDayOfWeek(DayOfWeek.values()[day]);
		}
		return weekdaysMap;
	}
	
	
	public List<DayOfWeek> weekends(Month month, int year){
		
		CalendarLogic cLogic = new CalendarLogic();
		Map<Integer, DayOfWeek> weekdays = cLogic.dayMap(month, year); 
		List<DayOfWeek> listOfWeekends = new ArrayList<DayOfWeek>();
		
		for(DayOfWeek d : weekdays.values()) {
			if(d.equals(DayOfWeek.SUN) || d.equals(DayOfWeek.SAT)) {
				listOfWeekends.add(d);
			}
		}
		return listOfWeekends;
		
		
	}
}
