package by.jonline.aggr_and_comp.tour.main;

import java.util.List;

import by.jonline.aggr_and_comp.tour.logic.TourLogic;
import by.jonline.aggr_and_comp.tour.view.TourView;
import by.jonline.aggr_and_comp_tour.entity.*;

public class TourMain {

	public static void main(String[] args) {
		
		Agency agency = new Agency();
		TourLogic tLogic = new TourLogic();
		TourView tView = new TourView();
		
		agency.addTour(new Tour("Krakow", TypeOfTour.CULTURAL, Transfer.BUS, Meal.RO, 2, 120.0));
		agency.addTour(new Tour("Sharm El Sheikh", TypeOfTour.LEISURE, Transfer.PLANE, Meal.AL, 9, 680.0));
		agency.addTour(new Tour("Karlovy Vary", TypeOfTour.HEALTH, Transfer.TRAIN, Meal.HB, 8, 650.0));
		agency.addTour(new Tour("Alpes", TypeOfTour.ECO, Transfer.BUS, Meal.FB, 10, 725.0));
		agency.addTour(new Tour("Mediterranian", TypeOfTour.LEISURE, Transfer.SHIP, Meal.UAL, 7, 1100.0));
		agency.addTour(new Tour("Shanghai", TypeOfTour.BUSINESS, Transfer.PLANE, Meal.BB, 3, 800.0));
		
		tLogic.sortByDays(agency);
		tView.showTours(agency.getTours());
		
		List<Tour> trainTours = tLogic.searchByTransfer(agency, Transfer.TRAIN);
		
		tView.showTours(trainTours);
		
		
		
		
		
	}

}
