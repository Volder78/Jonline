package by.epam.module2.array;

//Даны целые числа. Вывести на печать только те, для которых a(i) > i

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {

		int a[] = new int[10];
		int count = 0;
		Random r = new Random();

		System.out.println("Initial array:");

		for (int i = 0; i < a.length; i++) {
			a[i] = r.nextInt(18);
			System.out.print(a[i] + " ");
			if (a[i] > i) {
				count++;
			}
		}
		System.out.print("\nNumber of a(i) > i = " + count);
		System.out.println();
		System.out.println("\nArray after change:");

		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
