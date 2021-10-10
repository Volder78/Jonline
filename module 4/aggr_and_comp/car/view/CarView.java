package by.jonline.aggr_and_comp.car.view;

import by.jonline.aggr_and_comp.car.entity.*;

public class CarView {

	public void printModel(Car car) {
		System.out.println("Model: " + car.getModel());

	}
	
	public void printServiceMessage(Car car) {
		if(car.getGasVol() == 0) {
			System.out.println("Gas level is low. Refill the tank!");
		}
	}
	public void printSererviceMessage(Car car, Wheel wheel) {
		if(wheel.getBad() == true) {
			System.out.println("Stop and change the wheel!");
		}
	}

}
