package by.epam.module2.array2;

//Найти положительные элементы главной диагонали квадратной матрицы

import java.util.Scanner;

public class Task10 {

	public static void print(double[][] a) {
		for (double[] i : a) {
			for (double j : i) {
				System.out.printf("%8.1f", j);
			}
			System.out.print("\n");
			System.out.println();
		}
	}

	public static void fillInRandom(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.random() * 50 - 25;
			}
		}
	}

	public static int enter() {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int value;
		System.out.println("Enter array index");
		do {
			System.out.println("Positive integer!");
			while (!s.hasNextInt()) {
				System.out.println("Integer only!");
				s.next();
			}
			value = s.nextInt();
		} while (value <= 0);
		System.out.println("Index OK!");
		System.out.println();
		return value;
	}

	public static void main(String[] args) {
		int n = enter();
		double[][] a = new double[n][n];
		fillInRandom(a);

		System.out.println("Array is");
		print(a);
		
		System.out.println();
		System.out.println("Positive figures of main diagonal:");
		for (int i = 0; i < n; i++) {
			if (a[i][i] > 0) {
				System.out.printf("%8.1f", a[i][i]);
			}
		}
	}
}
