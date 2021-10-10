package by.epam.module2.array2;

import java.util.Scanner;

//Найти наибольший элемент матрицы и заменить все нечетные элементы на него

public class Task15 {

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static void fillInRandom(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 101);
			}
		}
	}

	public static int getMax(int[][] a) {
		int max = a[0][0];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (j > max) {
					max = j;
				}
			}

		}
		return max;
	}

	public static void exchangeForMax(int[][] a, int num) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] % 2 == 1 || a[i][j] % 2 == -1) {
					a[i][j] = num;
				}
			}
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows and columns");
		int m = s.nextInt();
		int n = s.nextInt();

		if (m > 0 && n > 0) {
			int[][] a = new int[m][n];
			fillInRandom(a);

			System.out.println("Initial array");
			printArray(a);

			System.out.println("\nArray under required condition");
			int max = getMax(a);
			exchangeForMax(a, max);

			printArray(a);
			System.out.println("Max integer in the array is " + max);

		} else {
			System.out.println("Number(s) should pe positive!");
		}

	}

}
