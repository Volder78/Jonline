package by.jonline.oop.calendar.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Calendar implements Serializable {
	
	private static final long serialVersionUID = 8302974307982497670L;
	
	private List<Day> days;
	
	public Calendar() {
		days = new ArrayList<Day>();
	}
	
	public Calendar(List<Day> days) {
		this.days = days;
	}
	
	public List<Day> getDays() {
		return days;
	}

	public void setDays(List<Day> days) {
		this.days = days;
	}
	




	public class Day implements Serializable {
		
		private static final long serialVersionUID = 3795363246956279801L;
		
		private int number;
		private DayOfWeek dayOfWeek;
		private Month month;

		public Day() {
			
		}
		
		public Day(int number) {
			this.number = number;
			
		}
		
		public Day(int number, DayOfWeek dayOfWeek, Month month) {
			this.number = number;
			this.dayOfWeek = dayOfWeek;
			this.month = month;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public DayOfWeek getDayOfWeek() {
			return dayOfWeek;
		}

		public void setDayOfWeek(DayOfWeek dayOfWeek) {
			this.dayOfWeek = dayOfWeek;
		}

		public Month getMonth() {
			return month;
		}

		public void setMonth(Month month) {
			this.month = month;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
			result = prime * result + ((month == null) ? 0 : month.hashCode());
			result = prime * result + number;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (dayOfWeek != other.dayOfWeek)
				return false;
			if (month != other.month)
				return false;
			if (number != other.number)
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "Day number=" + number + ", dayOfWeek=" + dayOfWeek + ", month=" + month;
		}
		
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar days=" + days;
	}
	
	
	
	

}
