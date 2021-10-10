package by.epam.module1.linear;

//Вывести данное значение в часах, минутах и секундах HHч, MMмин, SSс

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter seconds to convert");

		int start;
		int hour;
		int min;
		int sec;

		start = sc.nextInt();

		hour = start / 3600;
		min = (start % 3600) / 60;
		sec = (start % 3600) % 60;

		System.out.println(hour + "HH " + min + "MM " + sec + "SS");

	}
}
