package by.epam.module2.array2;

//Сформировать квадратную матрицу порядка N по правилу 

/*                            (  I2 - J2  )
                A[I][J] = sin (___________)
                              (    N      )
*/


import java.util.Scanner;

public class Task7 {
	public static int enterCheck() {

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int value;
		System.out.println("Enter array index");
		do {
			System.out.println("(Positive integer!)");
			while (!s.hasNextInt()) {
				System.out.println("Integer only!");
				s.next();
			}
			value = s.nextInt();
		} while (value <= 0);
		System.out.println("Index OK!");
		System.out.println();
		return value;
	}

	public static void main(String[] args) {
		int n = enterCheck();
		int count = 0;
		double[][] a = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = ((Math.sin((i * i) - (j * j) / n)));
				System.out.printf("%8.3f", a[i][j], "   ");
				if (a[i][j] > 0) {
					count++;
				}

			}
			System.out.print("\n");

		}
		System.out.println();
		System.out.println(count + " positive figures");

	}

}
