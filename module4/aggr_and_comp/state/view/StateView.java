package by.jonline.aggr_and_comp.state.view;

import by.jonline.aggr_and_comp.state.entity.Region;
import by.jonline.aggr_and_comp.state.entity.State;

public class StateView {
	
	public void printCapital(State state) {
		System.out.println("The capital of " + state.getStateName() + " is " + state.getCapital());
	}
	
	public void printNumberOfRegions(State state) {
		System.out.println("Number of regions: " + state.getRegions().size());
	}
	
	public void printArea(State state) {
		System.out.println("Area: " + state.getArea() + " sq.km");
	}
	
	public void printRegionalCentres(State state) {
		System.out.print("Regional centres: \n" );
		for(Region region : state.getRegions()) {
			System.out.println(region.getRegionCap().getCityName());
		}
	}

}
