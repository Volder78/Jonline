package by.jonline.aggr_and_comp.car.entity;

/*
	Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, 
	менять колесо, вывести на консоль марку автомобиля
*/

public class Car {

	private String model;
	private int gasVol;
	private Wheel wheel;
	private Engine engine;

	public Car() {
		model = "";
		gasVol = 0;
		engine = new Engine();
		wheel = new Wheel();
	}

	public Car(String model, int gasVol, Wheel wheel, Engine engine) {
		this.model = model;
		this.gasVol = gasVol;
		this.wheel = wheel;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public int getGasVol() {
		return gasVol;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setGasVol(int gasVol) {
		this.gasVol = gasVol;
	}

	public void setWheel(Wheel wheel, int index) {
		this.wheel = wheel;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + gasVol;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((wheel == null) ? 0 : wheel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (gasVol != other.gasVol)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (wheel == null) {
			if (other.wheel != null)
				return false;
		} else if (!wheel.equals(other.wheel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", gasVol=" + gasVol + ", wheel=" + wheel + ", engine=" + engine + "]";
	}

}
