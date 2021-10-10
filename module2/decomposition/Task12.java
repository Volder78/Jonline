package by.epam.module2.decomposition;

//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
//элементами которого являются числа, сумма цифр которых равна К и которые не больше N.

import java.util.Scanner;
import java.util.Random;

public class Task12 {

	public static int sumOfDigits(int n) {
		int sum = 0;
		int digit;
		while (n > 0) {
			digit = n % 10;
			sum += digit;
			n /= 10;
		}
		return sum;
	}

	public static boolean equals(int k, int n) {
		boolean equal;
		if (k == n) {
			equal = true;
		} else {
			equal = false;
		}
		return equal;
	}

	public static int[] fillArray(int k, int n, int num) {
		Random rand = new Random();
		int[] a = new int[num];
		for (int i = 1; i < a.length; i++) {
			int x = rand.nextInt(n + 1);
			while (!equals(sumOfDigits(x), k)) {
				x = rand.nextInt(n + 1);
			}
			a[i] = x;
		}
		return a;
	}

	public static void printArray(int[] a) {
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = s.nextInt();
		System.out.println("Enter K and N to fill the array according to problem's condition");
		int k = s.nextInt();
		int n = s.nextInt();
		int[] a = new int[size];

		if (k <= 18) {
			a = fillArray(k, n, size);
			System.out.println("\nArray is");
			printArray(a);
		} else {
			System.out.println("Impossible to fulfill condition with K = " + k);
		}

	}

}
