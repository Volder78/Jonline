package by.epam.module2.decomposition;

import java.util.Scanner;

/*	Задан массив D. Определить следующие суммы: D[1]+D[2]+D[3]; D[3]+D[4]+D[5];
 * 	D[4]+D[5]+D[6]
 */

public class Task8 {

	public static void arrayFilling(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101 - 51);
		}
	}

	public static void printArray(int[] a) {
		for (int value : a) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static int sumElements(int[] a, int start, int end) {
		if (start > end) {
			System.out.println("First element is larger than last");
		}
		if (end > a.length) {
			System.out.println("Last element is larger than array");
		}
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = a[start-1] + a[start] + a[end-1];
		}
		return sum;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array D size");
		int size = sc.nextInt();

		if (size > 0) {
			int[] a = new int[size];
			arrayFilling(a);

			System.out.println("\nArray D is");
			printArray(a);

			System.out.println("\nEnter 'k' and 'm' according to the problem solving");

			int start = sc.nextInt();
			int end = sc.nextInt();

			System.out.println("Sum is " + sumElements(a, start, end));
		} else {
			System.out.println("Wrong entry!");
		}

	}

}
