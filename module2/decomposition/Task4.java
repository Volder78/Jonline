package by.epam.module2.decomposition;

import java.util.Scanner;

//На плоскости заданы координаты n точек. Написать методы, определяющие, 
//между какими парами точек самое большое расстояние

public class Task4 {

	public static int[] maxDistance(double[] x, double[] y) {
		int[] a = new int[2];
		double maxDistance = 0;
		double currDistance;
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				currDistance = calcDistance(x[i], y[i], x[j], y[j]);
				if (currDistance > maxDistance) {
					maxDistance = currDistance;
					a[0] = i;
					a[1] = j;
				}
			}
		}
		return a;
	}

	public static double calcDistance(double x1, double y1, double x2, double y2) {
		double d = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return d;
	}

	public static void generate(double[] x, double[] y) {
		for (int i = 0; i < x.length; i++) {
			x[i] = Math.random() * 40 - 20;
			x[i] = Math.round(x[i] * 100) / 100.0d;
			y[i] = Math.random() * 40 - 20;
			y[i] = Math.round(y[i] * 100) / 100.0d;
		}
	}

	public static void print(double[] x, double[] y) {
		for (int i = 0; i < x.length; i++) {
			System.out.print("(" + x[i] + ", " + y[i] + ") ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 'n'");
		int n = s.nextInt();
		if (n > 0) {
			double[] x = new double[n];
			double[] y = new double[n];

			generate(x, y);
			print(x, y);

			int[] a = maxDistance(x, y);
			double max = calcDistance(x[a[0]], y[a[0]], x[a[1]], y[a[1]]);
			max = Math.round(max * 100) / 100.0d;
			System.out.print("\nMax distance = " + max + " between (" + x[a[0]] + ", " + y[a[0]] + ")");
			System.out.println(" and (" + x[a[1]] + ", " + y[a[1]] + ")");

		} else {
			System.out.println("Wrong 'n'");
		}

	}

}
