package by.epam.module2.array2;

import java.util.Scanner;

//Отсортировать строки матрицы по возрастанию и убыванию

public class Task12 {

	public static void printArray(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%8.2f", a[i][j]);
			}
			System.out.print("\n");
			System.out.println();
		}

	}

	public static void fillInRandom(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.random() * 101 - 51;
			}
		}
	}

	public static void sortAscending(double[][] a) {
		double temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length - 1; j++) {
				for (int k = 0; k < a[0].length - j - 1; k++) {
					if (a[i][k] > a[i][k + 1]) {
						temp = a[i][k];
						a[i][k] = a[i][k + 1];
						a[i][k + 1] = temp;
					}
				}
			}
		}
	}

	public static void sortDescending(double[][] a) {
		double temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length - 1; j++) {
				for (int k = 0; k < a[0].length - j - 1; k++) {
					if (a[i][k] < a[i][k + 1]) {
						temp = a[i][k];
						a[i][k] = a[i][k + 1];
						a[i][k + 1] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int m = s.nextInt();
		System.out.println("Enter number of columns");
		int n = s.nextInt();
		if (m > 0 && n > 0) {
			double[][] a = new double[m][n];
			fillInRandom(a);

			System.out.println("Array is");
			printArray(a);

			sortAscending(a);
			System.out.println("\nAscending lines: ");
			printArray(a);

			sortDescending(a);
			System.out.println("\nDescending lines: ");
			printArray(a);

		} else {
			System.out.println("Number should be positive!");
		}

	}

}
