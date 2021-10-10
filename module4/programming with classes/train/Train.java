package by.epam.classprog.train;

/*
	Создайте класс  Train, содержащий  поля: название пункта назначения, номер поезда, время отправления. 
	Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
	номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
	Добавьте  возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
	назначения должны быть упорядочены по времени отправления
*/

public class Train {
	
	private int trainNumber;
	private String destination;
	private String departureTime;

	public Train() {

	}

	public Train(int trainNumber, String destination, String departureTime) {
		this.trainNumber = trainNumber;
		this.destination = destination;
		this.departureTime = departureTime;
	}

	public void setTrainNumber(int trainNumber) {
		if (trainNumber > 0) {
			this.trainNumber = trainNumber;
		}
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setDestination(String destination) {
		if (destination != null && !destination.isEmpty()) {
			this.destination = destination;
		}
	}

	public String getDestination() {
		return destination;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Train t = (Train) obj;
		return trainNumber == t.trainNumber && destination.equals(t.destination)
				&& departureTime.equals(t.departureTime);
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;

		result = PRIME * result + trainNumber;
		result = PRIME * result + ((destination == null) ? 0 : destination.hashCode());
		result = PRIME * result + ((departureTime == null) ? 0 : departureTime.hashCode());

		return result;
	}

	@Override
	public String toString() {
		return trainNumber + destination + departureTime;
	}

}
