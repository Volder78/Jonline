package by.epam.module2.array2;

import java.util.Random;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. 
//Вывести саму матрицу и номера строк, в к-рых число 5 встречается три и более раз

public class Task11 {

	public static void fillIn(int[][] a) {
		Random r = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = r.nextInt(16);

			}
		}

	}

	public static void main(String[] args) {
		int m = 10;
		int n = 20;
		int[][] a = new int[m][n];
		int count = 0;
		boolean[] timesOfFive = new boolean[m];
		boolean enoughFive = false;
		fillIn(a);

		System.out.println("Array is");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%4d", a[i][j]);
				if (a[i][j] == 5) {
					count++;
				}
			}
			if (count >= 3) {
				timesOfFive[i] = true;
				enoughFive = true;

			}
			count = 0;
			System.out.print("\n");
			System.out.println();

		}
		if (enoughFive) {
			System.out.println("Line(s) with three or more '5s' ");
			for (int i = 0; i < m; i++) {
				if (timesOfFive[i]) {
					System.out.print((i + 1) + " ");
				}
			}

		} else {
			System.out.println("No lines containing a '5'");
		}

	}

}
