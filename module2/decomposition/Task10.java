package by.epam.module2.decomposition;

import java.util.Scanner;

//Дано натуральное число N. Написать метод для формирования массива из цифр числа N

public class Task10 {

	public static int countNumbers(int num) {
		int count = 0;
		while (num > 0) {
			num /= 10;
			count++;
		}
		return count;
	}

	public static int[] fillArray(int n) {
		int number = countNumbers(n);
		int[] a = new int[number];
		for (int i = a.length - 1; i >= 0; i--) {
			a[i] = n % 10;
			n /= 10;
		}
		return a;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number to create array");
		int n = s.nextInt();
		int[] a = fillArray(n);
		System.out.println("Array is");

		printArray(a);

	}
}
