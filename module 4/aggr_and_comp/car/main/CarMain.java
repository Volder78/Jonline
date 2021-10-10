package by.jonline.aggr_and_comp.car.main;

import by.jonline.aggr_and_comp.car.entity.*;
import by.jonline.aggr_and_comp.car.logic.CarService;
import by.jonline.aggr_and_comp.car.view.CarView;

public class CarMain {

	public static void main(String[] args) {
		
		Engine engine = new Engine(false);
		Wheel wheel = new Wheel(true);
		Car car = new Car("Toyota", 0, wheel, engine);
		CarView view = new CarView(); 
		CarService service = new CarService();
		
		
		service.driveCar(car);
		view.printModel(car);
		
		view.printServiceMessage(car);
		service.addGas(car, 20);
		
		car.getEngine().setActive(true);
		service.driveCar(car);
		
		view.printSererviceMessage(car, wheel);
		service.changeWheel(car, wheel, 16);
		
		service.driveCar(car);
		
		
		
			
		

	}

}
