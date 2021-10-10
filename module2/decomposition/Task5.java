package by.epam.module2.decomposition;

import java.util.Scanner;

//В массиве a[n] найти второе по величине число

public class Task5 {

	public static int secondLargest(int[] a) {
		int max = a[0];
		int secondMax = a[0];
		for (int value : a) {
			if (value > max) {
				secondMax = max;
				max = value;
			} else {
				if (value < max && value > secondMax || max == secondMax) {
					secondMax = value;
				}
			}
		}
		return secondMax;
	}

	public static void fillArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 51 - 20);
		}
	}

	public static void print(int[] a) {
		for (int value : a) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public static int enterCheck() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int value;
		System.out.println("Enter array index");
		do {
			// System.out.println("Positive integers!");
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

		int[] a = new int[n];

		fillArray(a);
		System.out.println("Array is");
		print(a);

		System.out.println("\nSecond largest number is " + secondLargest(a));

	}

}
