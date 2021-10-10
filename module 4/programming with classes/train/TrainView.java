package by.epam.classprog.train;

import java.util.List;

public class TrainView {

	TrainLogic tLogic = new TrainLogic();

	public void print(List<Train> trains) {

		System.out.printf("%-9s%-13s%-20s\n", "№ поезда", "Направление", "Время отправления");
		for (Train train : trains) {
			printTrain(train);
		}
	}

	public void printTrain(Train train) {

		System.out.println("---------------------------------------");
		System.out.printf("%-9d%-13s%2s\n", train.getTrainNumber(), train.getDestination(), train.getDepartureTime());

	}

	public void printInfoByNumber(List<Train> trains) {

		int number;
		Train train;
		CustomerInput input = new CustomerInput();

		number = input.getTrainNumber();
		train = tLogic.getInfoAboutTrainByNumber(number, trains);

		if (train != null) {
			System.out.printf("%-9s%-13s%-20s\n", "№ поезда", "Направление", "Время отправления");
			printTrain(train);
			// System.out.println("---------------------------------------");
		} else {
			System.out.println("Поезд с номером " + number + " отсутствует в расписании!");
		}
	}
	
	

}
