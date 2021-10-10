package by.epam.module2.array2;

import java.util.Scanner;

//В числовой матрице поменять местами два любых столбца. Номера столбцов вводит пользователь с клавиатуры

public class Task8 {

	public static void formation(int[][] m) {
		for (int[] i : m) {
			for (int j : i) {
				System.out.printf("%6d", j);
			}
			System.out.print("\n");
		}
	}

	public static void randFilling(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (int) (Math.random() * 101 - 51);
			}
		}
	}

	public static void columnSwap(int[][] m, int col1, int col2) {
		if (col1 > m[0].length || col2 > m[0].length || col1 <= 0 || col2 <= 0) {
			System.out.println("Wrong column numbers!");
		}
		int temp;
		for (int i = 0; i < m.length; i++) {
			temp = m[i][col1 - 1];
			m[i][col1 - 1] = m[i][col2 - 1];
			m[i][col2 - 1] = temp;
		}

	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of rows and columns of the array");
		int row = s.nextInt();
		int col = s.nextInt();
		if (row > 0 && col > 0) {
			int[][] a = new int[row][col];
			randFilling(a);

			System.out.println("Initial array");
			formation(a);

			System.out.println("Enter columns to swap");
			int col1 = s.nextInt();
			int col2 = s.nextInt();
			if (col1 > 0 && col2 > 0) {
				columnSwap(a, col1, col2);
				System.out.println("Array after change");
				formation(a);
			} else {
				System.out.println("Error!");
			}
		} else {
			System.out.println("Array index should be positive");
		}

	}

}
