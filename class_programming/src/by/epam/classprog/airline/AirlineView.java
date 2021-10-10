package by.epam.classprog.airline;

import java.util.List;

public class AirlineView {
	
	public void printAirlineList(AirlineList list) {
		System.out.println("Flights: ");
		System.out.println("--------------------------------------------------------------------");
		
		for(Airline airline : list.getList()) {
			System.out.println(airline.toString());
		}
		System.out.println();
	}
	
	public void printSortedList(List<Airline> airlines) {
		System.out.println("Flights sorted: ");
		System.out.println("---------------------------------------------------------------------");
		
		for(Airline airline : airlines) {
			System.out.println(airline.toString());
		}
		System.out.println();
	}
	

}
