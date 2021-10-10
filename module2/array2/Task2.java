package by.epam.module2.array2;

//Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали

public class Task2 {

	public static void main(String[] args) {
		int n = 5;
		int[][] a = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = (int) (Math.random() * 10);
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");

			}

		}
		
		System.out.println();
		
		System.out.println("\nMain diagonal elements are: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print(a[i][j] + " ");
				}

			}

		}

	}

}
