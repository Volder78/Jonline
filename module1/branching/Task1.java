package by.epam.module1.branching;

/*   Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
 *   и если да, то будет ли он прямоугольным
 */

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter angle 1");

		double angle1;
		double angle2;
		double angle3;

		angle1 = sc.nextDouble();

		System.out.println("Enter angle 2");

		angle2 = sc.nextDouble();
		angle3 = 180 - angle1 - angle2;

		if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
			System.out.println("Triangle is real");

			if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
				System.out.println("Triangle is right");
			}
		} else {
			System.out.println("Unreal triangle");
		}

	}

}
