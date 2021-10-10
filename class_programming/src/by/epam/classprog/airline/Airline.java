package by.epam.classprog.airline;

/*
	Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
	и метод  toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и 
	методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 
       Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.  
       Найти и вывести:  
       a) список рейсов для заданного пункта назначения;  
       b) список рейсов для заданного дня недели;  
       c) список рейсов для заданного дня недели, время вылета для которых больше заданного

*/

public class Airline {

	private String destination;
	private int flightNumber;
	private String jetType;
	private Time departureTime;
	private String day;

	public Airline() {
		super();
		destination = "";
		flightNumber = 0;
		jetType = "";
		departureTime = new Time();
		day = "";
	}

	public Airline(String destination, int flightNumber, String jetType, Time departureTime, String day) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.jetType = jetType;
		this.departureTime = departureTime;
		this.day = day;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getJetType() {
		return jetType;
	}

	public void setJetType(String jetType) {
		this.jetType = jetType;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return String.format("%-15s %-10s %-15s %13s %-15s", destination, flightNumber, jetType, departureTime, day);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		result = prime * result + ((jetType == null) ? 0 : jetType.hashCode());
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
		Airline other = (Airline) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		if (jetType == null) {
			if (other.jetType != null)
				return false;
		} else if (!jetType.equals(other.jetType))
			return false;
		return true;
	}

}
