package by.epam.classprog.airline;

import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {
	
	public List<Airline> getByDestination(AirlineList list, String destination) {
		List<Airline> flights = new ArrayList<>();
		
		for(Airline airline : list.getList()) {
			if(airline.getDestination().equals(destination)) {
				flights.add(airline);
			}
		}
		return flights;
	}
	
	public List<Airline> getByDay(AirlineList list, String day) {
		List<Airline> flights = new ArrayList<>();
		
		for(Airline airline : list.getList()) {
			if(airline.getDay().equals(day)) {
				flights.add(airline);
			}
		}
		
		return flights;
	}
	
	public List<Airline> getByTime(AirlineList list, Time time, String day) {
		List<Airline> flights = new ArrayList<>();
		
		for(Airline airline : list.getList()) {
			boolean isLater = airline.getDepartureTime().compareTo(time) > 0;
			if(airline.getDay().equals(day) && isLater) {
				flights.add(airline);
			}
		}
		return flights;
	}

}
