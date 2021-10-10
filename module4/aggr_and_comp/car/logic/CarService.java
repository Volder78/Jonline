package by.jonline.aggr_and_comp.car.logic;

import by.jonline.aggr_and_comp.car.entity.*;

public class CarService {

	public void driveCar(Car car) {
		boolean isEmpty;
		isEmpty = car.getGasVol() == 0;
		if (car.getEngine().getActive() && !isEmpty) {
			System.out.println("Driving");
		} else {
			System.out.println("Check your vehicle!");
		}

	}

	public void addGas(Car car, int gas) {
		int vol;
		vol = car.getGasVol();
		vol += gas;
		car.setGasVol(vol);
		System.out.println("Gas level is " + vol);
	}

	public void changeWheel(Car car, Wheel wheel, int index) {
		car.setWheel(wheel, index);
		System.out.println("Wheel fixed");
	}

}
