package by.epam.classprog.time;

/*
	Составьте  описание класса для представления времени. Предусмотрите  возможности установки времени и 
	изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае 
	недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на 
	заданное количество часов, минут и секунд
*/

public class Time {

	private int hours;
	private int minutes;
	private int seconds;
	private int timeInSeconds;
	
	private final int HOURS_IN_DAY = 24;
	private final int MINUTES_IN_HOUR = 60;
	private final int SECONDS_IN_MINUTE = 60;
	private final int SECONDS_IN_DAY = 86400;

	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		checkTime();
	}
	
	public Time(int timeInSeconds) {
		setTime(timeInSeconds);
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setHours(int hours) {
		if (hours >= 0 || hours < 24) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
		checkTime();
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 || minutes < 60) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
		checkTime();
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 || seconds < 60) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
		checkTime();
	}
	
	public void addHours(int hours) {
		int currentTime = getTimeInSeconds();
		hours = hours * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
		currentTime += hours;
		setTime(currentTime);
	}
	
	public void addMinutes(int minutes) {
		int currentTime = getTimeInSeconds();
		minutes *= SECONDS_IN_MINUTE;
		currentTime += minutes;
		setTime(currentTime);
	}
	
	public void addSeconds(int seconds) {
		int currentTime = getTimeInSeconds();
		currentTime += seconds;
		setTime(currentTime);
	}
	
	public int getTimeInSeconds() {
		return timeInSeconds;
	}
	
	public void setTime(int time) {
		time = (time < 0) ? SECONDS_IN_DAY + time % SECONDS_IN_DAY : time;
		timeInSeconds = (time < SECONDS_IN_DAY) ? time : time % SECONDS_IN_DAY;
		int temp = timeInSeconds;
		hours = (int)Math.floor(temp / (MINUTES_IN_HOUR * SECONDS_IN_MINUTE));
		temp -= hours * MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
		minutes = (int)Math.floor(temp / MINUTES_IN_HOUR);
		seconds = temp - minutes * SECONDS_IN_MINUTE;
	}
	
	public void checkTime() {
		hours = (hours < 0 || hours >= HOURS_IN_DAY) ? 0 : hours;
		minutes = (minutes < 0 || minutes >= MINUTES_IN_HOUR) ? 0 : minutes;
		seconds = (seconds < 0 || seconds >= SECONDS_IN_MINUTE) ? 0 : seconds;
		timeInSeconds = hours * MINUTES_IN_HOUR * SECONDS_IN_MINUTE + minutes * SECONDS_IN_MINUTE + seconds;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Time time = (Time) obj;
		if (hours != time.hours) {
			return false;
		}
		if (minutes != time.minutes) {
			return false;
		}
		if (seconds != time.seconds) {
			return false;
		}
		return true;

	}

	public String toString() {
		return ((hours < 10 ? "0" : "") + hours + ":" + (minutes < 10 ? "0" : "") + minutes + ":"
				+ (seconds < 10 ? "0" : "") + seconds);

	}

}
