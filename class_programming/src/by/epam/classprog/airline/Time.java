package by.epam.classprog.airline;

public class Time implements Comparable<Time> {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	private static final int SECONDS_IN_DAY = 86400;
	private static final int SECONDS_IN_HOUR = 3600;
	private static final int SECONDS_IN_MINUTE = 60;
	private static final int MINUTES_IN_HOUR = 60;
	private static final int HOURS_IN_DAY = 24;
	
	public Time() {
		super();
		hours = 0;
		minutes = 0;
		seconds = 0;
	}
	
	public Time(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		if(hours >= 0 || hours < HOURS_IN_DAY) {
			this.hours = hours;
		}
		else {
			this.hours = 0;
		}
 	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		if(minutes >= 0 || minutes < MINUTES_IN_HOUR) {
			this.minutes = minutes;
		}
		else {
			this.minutes = 0;
		}
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		if(seconds >= 0 || seconds < SECONDS_IN_MINUTE) {
			this.seconds = seconds;
		}
		else {
			this.seconds = 0;
		}
	}
	
	public void addTime(int hours, int minutes, int seconds) {
		int currentTime;
		currentTime = SECONDS_IN_HOUR * this.hours + SECONDS_IN_MINUTE * this.minutes + this.seconds;
		
		int addedTime;
		addedTime = SECONDS_IN_HOUR * hours + SECONDS_IN_MINUTE * minutes + seconds;
		
		currentTime += addedTime;
		currentTime %= SECONDS_IN_DAY;
		
		setTime(currentTime);
	}
	
	public void subtracTime(int hours, int minutes, int seconds) {
		int currentTime;
		currentTime = SECONDS_IN_HOUR * this.hours + SECONDS_IN_MINUTE * this.minutes + this.seconds;
		
		int addedTime;
		addedTime = SECONDS_IN_HOUR * hours + SECONDS_IN_MINUTE * minutes + seconds;
		
		currentTime -= addedTime;
		if(currentTime < 0) {
			currentTime = Math.abs(currentTime % SECONDS_IN_DAY);
			currentTime = SECONDS_IN_DAY - currentTime;
		}
		setTime(currentTime);
	}
	
	public void setTime(int timeInSeconds) {
		hours = timeInSeconds / SECONDS_IN_HOUR;
		timeInSeconds %= SECONDS_IN_HOUR;
		minutes = timeInSeconds / SECONDS_IN_MINUTE;
		seconds = timeInSeconds % SECONDS_IN_MINUTE;
		
	}
	
	@Override
	public String toString() {
		return ((hours < 10 ? "0" : "") + hours + ":" + (minutes < 10 ? "0" : "") + minutes + ":"
				+ (seconds < 10 ? "0" : "") + seconds);
	}
	
	@Override
	public int compareTo(Time t) {
		int result;
		result = Integer.valueOf(this.hours).compareTo(t.hours);

		if (result > 0) {
			return 1;
		} else if(result < 0) {
			return -1;
		}
		result = Integer.valueOf(this.minutes).compareTo(t.minutes);

		if (result > 0) {
			return 1;
		} else if(result < 0) {
			return -1;
		}
		result = Integer.valueOf(this.seconds).compareTo(t.seconds);
		if (result > 0) {
			return 1;
		} else if(result < 0) {
			return -1;
		}
		return result;

	}

}
