package by.epam.module1.linear;

/*   Для данной области составить линейную программу,
 *   которая печатает "true" если точка с координатами (x,y)
 *   принадлежит закрашенной области, и "false" - в противном случае
 */

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int x;
		int y;
		boolean b;

		System.out.println("Enter 'x'");
		x = scan.nextInt();

		System.out.println("Enter 'y'");
		y = scan.nextInt();

		if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)) {
			b = true;
			System.out.println(b);
		} else {
			b = false;
			System.out.println(b);
		}

	}
}
