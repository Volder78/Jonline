package by.epam.module2.array2;

// Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
//Определить, какой столбец содержит максимальную сумму

import java.util.Scanner;

public class Task9 {

	public static void print(double[][] a) {
		for (double[] i : a) {
			for (double j : i) {
				System.out.printf("%10.3f", j);
			}
			System.out.print("\n");
		}
	}

	public static void fillInRandom(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.random() * 101;

			}
		}
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of array's rows and columns");
		int row = s.nextInt();
		int col = s.nextInt();

		if (row > 0 && col > 0) {
			double[][] a = new double[row][col];
			fillInRandom(a);

			System.out.println("Array is");
			print(a);

			System.out.println();

			double maxSum = 0;
			double sum = 0;
			double[] sumOfCol = new double[col];
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < row; j++) {
					sum += a[j][i];
				}
				if (sum > maxSum) {
					maxSum = sum;
				}
				sumOfCol[i] = sum;

				System.out.printf("%10.3f", sum);
			}
			System.out.print("\n");
			System.out.println("Column with max sum:");
			for (int i = 0; i < col; i++) {
				if (sumOfCol[i] == maxSum) {
					System.out.print((i + 1) + " ");
				}
			}
		}
	}
}
