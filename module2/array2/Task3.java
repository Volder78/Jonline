package by.epam.module2.array2;

//  Дана матрица. Вывести k-ю строку и p-й столбец матрицы 

public class Task3 {

	public static void main(String[] args) {
		int m = 7;
		int n = 9;
		int k = 1;
		int p = 2;
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = (int) (Math.random() * 10);

			}
		}
		System.out.println("Array of Arrays is: ");
		for (int i = 0; i < m; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
		
		System.out.print("\nRow k is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[k][i] + " ");
		}
		System.out.print("\nColumn p is: \n");
		for (int i = 0; i < m; i++) {
			System.out.println(a[i][p] + " ");
		}
		//System.out.println();

	}

}
