package by.jonline.aggr_and_comp.tour.view;

import java.util.List;

import by.jonline.aggr_and_comp_tour.entity.Tour;

public class TourView {
	
	public void showTours(List<Tour> tours) {
		System.out.printf("%10s %15s %18s %12s %7s %10s", "Where To", "Type", "Tranfer", "Meal", "Days", "Price");
		System.out.println("\n-------------------------------------------------------------------------------");
		for(Tour tour : tours) {
			System.out.println(tour.toString());
		}
		System.out.println();
	}

}
