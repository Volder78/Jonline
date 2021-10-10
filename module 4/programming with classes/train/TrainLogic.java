package by.epam.classprog.train;

import java.util.List;

public class TrainLogic {
	
	public void sortByNumber(List<Train> trains) {
		
		for (int i = trains.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				if (trains.get(j).getTrainNumber() > trains.get(j + 1).getTrainNumber()) {
					Train temp;
					temp = trains.get(j);
					trains.remove(j);
					trains.add(j, trains.get(j));
					trains.remove(j + 1);
					trains.add(j + 1, temp);
				}
			}
		}

	}

	public void sortByDestination(List<Train> trains) {
		
		for (int i = trains.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				if (trains.get(j).getDestination().compareTo(trains.get(j + 1).getDestination()) > 0) {					
					Train temp;
					temp = trains.get(j);
					trains.remove(j);
					trains.add(j, trains.get(j));
					trains.remove(j + 1);
					trains.add(j + 1, temp);
				}
			}
		}

	}

	public void sortByTime(List<Train> trains) {
		
		for (int i = trains.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				
				boolean sameDestination;
				sameDestination = trains.get(j).getDestination().compareTo(trains.get(j + 1).getDestination()) == 0;
				
				boolean isLater;
				isLater = trains.get(j).getDepartureTime().compareTo(trains.get(j + 1).getDepartureTime()) > 0;
				
				if (sameDestination && isLater) {					
					Train temp;
					temp = trains.get(j);
					trains.remove(j);
					trains.add(j, trains.get(j));
					trains.remove(j + 1);
					trains.add(j + 1, temp);

				}
			}
		}
	}

	public Train getInfoAboutTrainByNumber(int num, List<Train> trains) {
		
		for (Train t : trains) {
			if (num == t.getTrainNumber()) {
				return t;
			}
		}
		return null;
	}

}
