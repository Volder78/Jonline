package by.epam.module2.array2;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу (n - четное) 
/*
                  (1   1   1   ...   1   1   1)
                  (0   1   1   ...   1   1   0)
                  (0   0   1   ...   1   0   0)
                  (...........................)
                  (0   1   1   ...   1   1   0)
                  (1   1   1   ...   1   1   1)
*/  

public class Task6 {
	public static int enter() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int value;
		System.out.println("Enter array index");
		do {
			System.out.println("Even positive integer!");
			while (!s.hasNextInt()) {
				System.out.println("Even integer only!");
				s.next();
			}
			value = s.nextInt();
		} while (value % 2 != 0 || value <= 0);
		System.out.println("Index OK!");
		System.out.println();
		return value;
	}

	public static void main(String[] args) {
		int n = enter();
		int[][] a = new int[n][n];
		System.out.println("Array under required conditions is ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < n / 2) {
					if (i > j || j > n - i - 1) {
						a[i][j] = 0;
					} else {
						a[i][j] = 1;
					}
				} else {
					a[i][j] = a[n - i - 1][j];
				}
				System.out.print(a[i][j] + " ");

			}
			System.out.print("\n");
		}

	}

}
