package by.epam.classprog.train;

/*
 *  Создайте класс  Train, содержащий  поля: название пункта назначения, номер поезда, время отправления. 
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по 
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
Добавьте  возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами 
назначения должны быть упорядочены по времени отправления
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Train> trains = new ArrayList<>();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();

		trains.add(new Train(315, "Брест", "17:45"));
		trains.add(new Train(48, "Минск", "00:12"));
		trains.add(new Train(624, "Гомель", "21:38"));
		trains.add(new Train(795, "Брест", "13.35"));
		trains.add(new Train(745, "Гродно", "10:21"));

		view.printInfoByNumber(trains);
		System.out.println();

		logic.sortByNumber(trains);
		view.print(trains);

		System.out.println();
		logic.sortByDestination(trains);

		logic.sortByTime(trains);
		view.print(trains);

	}

}
