package by.epam.module1.branching;

/*   Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
 *   Определить, будут ли они расположены на одной прямой
 */

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter x1");

		double x1, y1;
		double x2, y2;
		double x3, y3;

		x1 = s.nextDouble();
		System.out.println("Enter y1");

		y1 = s.nextDouble();
		System.out.println("Enter x2");

		x2 = s.nextDouble();
		System.out.println("Enter y2");

		y2 = s.nextDouble();
		System.out.println("Enter x3");

		x3 = s.nextDouble();
		System.out.println("Enter y3");

		y3 = s.nextDouble();

		if (((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1))) {
			System.out.println("Points A, B, C belong to line 'a'");
		} else {
			System.out.println("Points A, B, C don't belong to line 'a'");
		}

	}
}
