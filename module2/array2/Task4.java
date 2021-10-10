package by.epam.module2.array2;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу (n - четное) (1 2   3  ... n)
//                                                                            (n n-1 n-2... 1)

public class Task4 {

	public static void main(String[] args) {
		int n = enter();
		int[][] a = new int[n][n];
		System.out.println("Array under required conditions is ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					a[i][j] = 1 + j;
				} else {
					a[i][j] = n - j;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
	}

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

}
