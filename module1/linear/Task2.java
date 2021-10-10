package by.epam.module1.linear;

//   Найдите значение функции (все переменные принимают действительные значения)

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		double a;
		double b;
		double c;
		double res;

		System.out.println("Enter 'a'");
		a = s.nextDouble();

		System.out.println("Enter 'b'");
		b = s.nextDouble();

		System.out.println("Enter 'c'");
		c = s.nextDouble();

		res = ((b + (Math.sqrt((b * b) + (4 * a * c)) / (4 * a * c) - (a * a * a * c) + Math.pow(b, -2))));

		System.out.println();
		System.out.println("result is: " + res);

	}
}
