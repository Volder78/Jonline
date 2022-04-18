package by.jonline.oop.calendar.entity;

public enum Month {
	
	JANUARY(31, 0),
	FEBRUARY(28, 3),
	MARCH(31, 3),
	APRIL(30, 6),
	MAY(31, 1),
	JUNE(30, 4),
	JULY(31, 6),
	AUGUST(31, 2),
	SEPTEMBER(30, 5),
	OCTOBER(31, 0),
	NOVEMBER(30, 3),
	DECEMBER(31, 5);
	
	int dayNumber;
	int monthCode;
	
	Month(int dayNumber) {
		this.dayNumber = dayNumber;
	}
	
	Month(int dayNumber, int monthCode) {
		this.dayNumber = dayNumber;
		this.monthCode = monthCode;
	}
	
	public int getDayNumber() {
		return dayNumber;
	}
	
	public int getMonthCode() {
		return monthCode;
	}
	

}
