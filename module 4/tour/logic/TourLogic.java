package by.jonline.aggr_and_comp.tour.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.jonline.aggr_and_comp_tour.entity.*;

public class TourLogic {

	public List<Tour> searchByTransfer(Agency agency, Transfer transfer) {
		List<Tour> topTours = new ArrayList<Tour>();
		for (Tour tour : agency.getTours()) {
			boolean isOk = tour.getTransfer() == transfer;
			if (isOk) {
				topTours.add(tour);
			}
		}
		return topTours;
	}

	public List<Tour> searchByMeal(Agency agency, Meal meal) {
		List<Tour> topTours = new ArrayList<Tour>();

		for (Tour tour : agency.getTours()) {
			boolean isOk = tour.getMeal() == meal;
			if (isOk) {
				topTours.add(tour);
			}
		}
		return topTours;
	}

	public List<Tour> searchByDestination(Agency agency, String destination) {
		List<Tour> topTours = new ArrayList<Tour>();

		for (Tour tour : agency.getTours()) {
			boolean isOk = tour.getDestination() == destination;
			if (isOk) {
				topTours.add(tour);
			}
		}
		return topTours;
	}

	public List<Tour> searchByType(Agency agency, TypeOfTour type) {
		List<Tour> topTours = new ArrayList<Tour>();

		for (Tour tour : agency.getTours()) {
			boolean isOk = tour.getType() == type;
			if (isOk) {
				topTours.add(tour);
			}
		}
		return topTours;
	}

	public List<Tour> searchByPeriod(Agency agency, int numberOfDays) {
		List<Tour> topTours = new ArrayList<Tour>();

		for (Tour tour : agency.getTours()) {
			boolean isOk = tour.getNumberOfDays() == numberOfDays;
			if (isOk) {
				topTours.add(tour);
			}
		}

		return topTours;
	}

	public List<Tour> seachByAllCriteria(Agency agency, Transfer transfer, Meal meal, int numberOfDays) {
		List<Tour> topTours = new ArrayList<Tour>();

		for (Tour tour : agency.getTours()) {
			boolean isOk;
			isOk = tour.getTransfer() == transfer && tour.getMeal() == meal && tour.getNumberOfDays() == numberOfDays;
			if (isOk) {
				topTours.add(tour);
			}

		}
		return topTours;
	}

	public void sortByDays(Agency agency) {
		
		agency.getTours().sort(Comparator.comparing(Tour::getNumberOfDays));
	}
	
	public void sortByPrice(Agency agency) {
		
		agency.getTours().sort(Comparator.comparingDouble(Tour::getPrice));
	}

}
