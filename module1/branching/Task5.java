package by.epam.module1.branching;

//   Вычислить значение функции f(x)

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		double x;

		System.out.println("Enter 'x'");
		x = scan.nextDouble();

		if (x <= 3) {
			System.out.println("F(x) = " + ((x * x) - (3 * x) + 9));
		} else {
			System.out.println("F(x) = " + (1 / (x * x * x + 6)));
		}

	}
}
