package by.epam.module2.decomposition;

import java.util.Scanner;

//Даны X,Y,Z,T - длины сторон четырехугольника. Вычислить его площадь если угол между X и Y прямой

public class Task9 {

	public static double rightTriangleSq(double s1, double s2) {
		double sq;
		if (s1 > 0 && s2 > 0) {
			sq = (s1 * s2) / 2;
		} else {
			sq = -1;
		}
		return sq;
	}

	public static double secTriangleSq(double s1, double s2, double s3) {
		double sq;
		boolean exists = isExisting(s1, s2, s3);
		if (s1 > 0 && s2 > 0 && s3 > 0 && exists) {
			double p = (s1 + s2 + s3) / 2;
			sq = Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
		} else {
			sq = -1;
		}
		return sq;
	}

	public static boolean isExisting(double s1, double s2, double s3) {
		boolean triangleExists = (s1 < s2 + s3) && (s2 < s1 + s3) && (s3 < s1 + s2);
		return triangleExists || s1 == s2 && s2 == s3;

	}

	public static double calcSq(double s1, double s2, double s3, double s4) {
		double sq;
		double sq1 = rightTriangleSq(s1, s2);
		double sq2 = secTriangleSq(Math.sqrt(s1 * s1 + s2 * s2), s3, s4);
		boolean rectExists = sq1 > 0 && sq2 > 0;

		if (s1 > 0 && s2 > 0 && s3 > 0 && s4 > 0 && rectExists) {
			sq = sq1 + sq2;
		} else {
			sq = -1;
		}
		return sq;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two sides with right angle");
		double s1 = sc.nextDouble();
		double s2 = sc.nextDouble();

		System.out.println("Enter two other sides of the rectangle");
		double s3 = sc.nextDouble();
		double s4 = sc.nextDouble();

		double sq = calcSq(s1, s2, s3, s4);
		if (sq > 0) {
			System.out.println("S = " + sq);
		} else {
			System.out.println("The rectangle doesn't exist");
		}

	}

}
