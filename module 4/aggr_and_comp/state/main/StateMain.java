package by.jonline.aggr_and_comp.state.main;

import by.jonline.aggr_and_comp.state.entity.City;
import by.jonline.aggr_and_comp.state.entity.Region;
import by.jonline.aggr_and_comp.state.entity.State;
import by.jonline.aggr_and_comp.state.view.StateView;

public class StateMain {

	public static void main(String[] args) {
		
		City city = new City("Minsk");
		State state = new State("Belarus", city, 207.6);
		
		state.getRegions().add(new Region("Brest", new City("Brest")));
		state.getRegions().add(new Region("Vitebsk", new City("Vitebsk")));
		state.getRegions().add(new Region("Gomel", new City("Gomel")));
		state.getRegions().add(new Region("Grodno", new City("Grodno")));
		state.getRegions().add(new Region("Minsk", new City("Minsk")));
		state.getRegions().add(new Region("Mogilev", new City("Mogilev")));
		
		StateView sView = new StateView();
		
		sView.printCapital(state);
		sView.printNumberOfRegions(state);
		sView.printArea(state);
		sView.printRegionalCentres(state);
		
	

	}

}
