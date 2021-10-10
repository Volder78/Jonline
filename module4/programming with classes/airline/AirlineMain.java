package by.epam.classprog.airline;

import java.util.List;

public class AirlineMain {

	public static void main(String[] args) {
		AirlineList theList = new AirlineList();
		
		theList.addAirline(new Airline("Warsaw", 2212, "Boeing 787", new Time(12, 26, 00), "Monday"));
		theList.addAirline(new Airline("New York", 7210, "Airbus A350", new Time(9, 12, 00), "Wednesday"));
		theList.addAirline(new Airline("Paris", 3021, "Tu-204", new Time(07, 58, 00), "Monday"));
		theList.addAirline(new Airline("Moscow", 1098, "Boeing 747", new Time(8, 15, 00), "Friday"));
		theList.addAirline(new Airline("Sydney", 6590, "Airbus A330", new Time(12, 57, 00), "Wednesday"));
		theList.addAirline(new Airline("Moscow", 3354, "IL-86", new Time(6, 15, 00), "Saturday"));

		AirlineLogic logic = new AirlineLogic();
		AirlineView aView = new AirlineView();
		
		aView.printAirlineList(theList);
		
		List<Airline> byDestination;
		byDestination = logic.getByDestination(theList, "Moscow");
		aView.printSortedList(byDestination);
		
		List<Airline> byDay;
		byDay = logic.getByDay(theList, "Wednesday");
		aView.printSortedList(byDay);
		
		List<Airline> byDayAndTime;
		byDayAndTime = logic.getByTime(theList, new Time(10, 10, 00), "Monday");
		aView.printSortedList(byDayAndTime);
	}

}
