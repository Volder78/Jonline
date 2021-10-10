package by.epam.module1.cycle;

/*   Для каждого натурального числа в промежутке от m до n вывести все делители, 
 *   кроме единицы и самого числа. m и n вводятся с клавиатуры
 */

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int m;
		int n;

		System.out.println("Enter 'm'");
		m = scan.nextInt();

		System.out.println("Enter 'n (should be > m)'");
		n = scan.nextInt();

		for (int i = m; i <= n; i++) {
			System.out.print(i + ": ");

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();

		}
	}
}
		