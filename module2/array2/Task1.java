package by.epam.module2.array2;

import java.util.Scanner;

// Дана матрица . Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

public class Task1 {
	public static int firstEntry() {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		System.out.println(">> ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Integer only!");
			System.out.println(">> ");
		}
		value = sc.nextInt();

		return value;
	}

	public static int secondEntry() {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of columns");
		System.out.println(">> ");

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("Integer only!");
			System.out.println(">> ");
		}
		value = sc.nextInt();

		return value;
	}

	public static void main(String[] args) {
		int m;
		int n;
		m = firstEntry();
		n = secondEntry();
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = (int) (Math.random() * 9);
			}
		}
		
		System.out.println("Matrix generated:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		// нумерация столбцов начинается с 1
		System.out.println("\nColumns with required conditions");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j += 2) {
				if (a[0][j] > a[m - 1][j]) {
					System.out.print(a[i][j] + "\t");
				} 
			}
			System.out.println();
		}
	}
}
