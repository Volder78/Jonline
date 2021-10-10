package by.epam.module2.array2;
//—формировать квадратную матрицу пор€дка n по заданному образцу (n - четное)  (1   1   1   ...   1   1)
//                                                                             (2   2   2   ...   2   0)
//                                                                             (3   3   3   ...   0   0)
//                                                                             (.......................)
//                                                                             (n-1 n-1 0   ...   0   0)
//                                                                             ( n   0  0   ...   0   0)
import java.util.Scanner;

public class Task5 {

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
				if (j < n - i) {
					a[i][j] = 1 + i;
				} else {
					a[i][j] = 0;
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

}
