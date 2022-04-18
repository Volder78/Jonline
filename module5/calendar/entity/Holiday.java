package by.jonline.oop.calendar.entity;

public enum Holiday {
	
	NEW_YEAR(1, Month.JANUARY, "New Year"),
	ORTHODOX_CHRISTMAS(7, Month.JANUARY, "Christmas"),
	WOMENS_DAY(8, Month.MARCH, "Women's Day"),
	LABOUR_DAY(1, Month.MAY, "Labour Day"),
	MEMORIAL_DAY(3, Month.MAY, "Memorial Day"),
	VICTORY_DAY(9, Month.MAY, "Victory Day"),
	INDEPENDENCE_DAY(3, Month.JULY, "Independence Day"),
	REVOLUTION_DAY(7, Month.NOVEMBER, "Revolution Day"),
	CATHOLIC_CHRISTMAS(25, Month.DECEMBER, "Christmas");
	
	private int day;
	private Month month;
	private String title;

	Holiday(int day, Month month, String title) {
		this.day = day;
		this.month = month;
		this.title = title;
	}

	public int getDay() {
		return day;
	}

	public Month getMonth() {
		return month;
	}

	public String getTitle() {
		return title;
	}
	
	public String toString() {
	
		return String.format("%-5s: %-2s, %-1s", title, month, day);
		
	}
	
	
	
	
	
	
	

}
