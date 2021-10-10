package by.epam.module1.branching;

/*   Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 *   Определить, пройдет ли кирпич через отверстие
 */

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 'a'");

		double a;
		double b;
		double x;
		double y;
		double z;

		a = scan.nextDouble();
		System.out.println("Enter 'b'");

		b = scan.nextDouble();
		System.out.println("Enter 'x'");

		x = scan.nextDouble();
		System.out.println("Enter 'y'");

		y = scan.nextDouble();
		System.out.println("Enter 'z'");

		z = scan.nextDouble();

		if ((a * b) == (x * y) || (a * b) == (x * z) || (a * b) == (y * z)) {
			System.out.println("Brick fits");

		} else {
			System.out.println("Brick doesn't fit");
		}

	}
}
