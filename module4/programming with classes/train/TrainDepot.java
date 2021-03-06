package by.epam.classprog.train;

import java.util.ArrayList;
import java.util.List;

public class TrainDepot {
	
	private List<Train> trains;

	public TrainDepot() {
		trains = new ArrayList<Train>();
	}

	public List<Train> getTrains() {
		return trains;
	}

	public void addTrain(Train train) {
		trains.add(train);
	}

	public int size() {
		return trains.size();
	}

	public Train getTrain(int index) {
		return trains.get(index);
	}

	public void setTrain(int index, Train train) {
		trains.set(index, train);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
		TrainDepot other = (TrainDepot) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [trains=" + trains + "]";
	}

}
