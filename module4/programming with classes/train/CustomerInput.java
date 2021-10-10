package by.epam.classprog.train;

import java.util.Scanner;

public class CustomerInput {

	public static int getInfoFromConsole(String string) {

		int num;

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print(string);

		while (!s.hasNextInt()) {
			s.next();
			System.out.print("Неправильный ввод!");
		}
		num = s.nextInt();

		return num;
	}

	public int getTrainNumber() {

		int number;
		boolean isCorrect;

		do {
			number = getInfoFromConsole("Введите номер поезда: ");
			isCorrect = number > 0;
			if (!isCorrect) {
				System.out.println("Неправильный ввод!");
			}
		} while (!isCorrect);

		return number;
	}

}
