package by.epam.module2.array2;

import java.util.Scanner;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, в каждом столбце число единиц равно номеру столбца

public class Task14 {

	public static void printArray(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%4d", a[i][j]);
			}
			System.out.print("\n");
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
			int[][] a = new int[m][n];
			if (n <= m) {

				int countOne;
				int index;

				for (int i = 0; i < n; i++) {
					countOne = i + 1;
					while (countOne != 0) {
						index = (int) (Math.random() * m);
						if (a[index][i] == 0) {
							a[index][i] = 1;
							countOne--;
						}
					}
				}
				System.out.println("\nArray is");
				printArray(a);
			} else {
				System.out.println("Impossible to generate an array based on these data");
			}
		} else {
			System.out.println("Number(s) should be positive!");
		}
	}

}
