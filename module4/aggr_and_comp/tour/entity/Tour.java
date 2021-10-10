package by.jonline.aggr_and_comp_tour.entity;

public class Tour {

	private String destination;
	private TypeOfTour type;
	private Transfer transfer;
	private Meal meal;
	private int numberOfDays;
	private double price;

	public Tour() {
		destination = "";
		type = TypeOfTour.DEFAULT;
		transfer = Transfer.DEFAULT;
		meal = Meal.DEFAULT;
		numberOfDays = 0;
		price = 0.0;
	}

	public Tour(String destination, TypeOfTour type, Transfer transfer, Meal meal, int numberOfDays, double price) {
		super();
		this.destination = destination;
		this.type = type;
		this.transfer = transfer;
		this.meal = meal;
		this.numberOfDays = numberOfDays;
		this.price = price;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public TypeOfTour getType() {
		return type;
	}

	public void setType(TypeOfTour type) {
		this.type = type;
	}

	public Transfer getTransfer() {
		return transfer;
	}

	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((meal == null) ? 0 : meal.hashCode());
		result = prime * result + numberOfDays;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transfer == null) ? 0 : transfer.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Tour other = (Tour) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (meal != other.meal)
			return false;
		if (numberOfDays != other.numberOfDays)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (transfer != other.transfer)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() { 
		return String.format("%-20s  %-15s %-15s %-7s %-7d %8.2f", destination, type, transfer, meal, numberOfDays,
				price);

	}

}
