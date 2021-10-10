package by.epam.module2.sorting;

import java.util.Scanner;

/*
	Даны 2 последовательности a1<=a2<=...an и b1<=b2<=...bm. 
	Указать места вставки эл-тов второй последовательности в первую, 
	чтобы новая последовательность осталась возрастающей
*/

public class Task7 {

	public static int[] insert(int[] receiver, int[] original) {
		int[] arrayOfIndexes = new int[original.length];
		for (int i = 0; i < original.length; i++) {
			arrayOfIndexes[i] = binarySearch(receiver, original[i]) + i;
		}
		return arrayOfIndexes;
	}

	public static int binarySearch(int[] a, int num) {
		int first = 0;
		int last = a.length - 1;
		int middle = 0;
		if (num <= a[first]) {
			return first;
		}
		if (num >= a[last]) {
			return last + 1;
		}
		while (first <= last) {
			middle = (first + last) / 2;
			if (num >= a[middle] && num <= a[middle + 1]) {
				return middle + 1;
			}
			if (a[middle] < num) {
				first = middle;
			} else if (a[middle] > num) {
				last = middle;
			}
		}
		return -1;
	}

	public static int[] generateArray(int size) {
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = (int) (Math.random() * 101);
		}
		exchange(a);
		return a;
	}

	public static void exchange(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swapArrayElements(a, j, j + 1);
				}
			}
		}
	}

	public static void swapArrayElements(int[] a, int index1, int index2) {
		int temp;
		temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
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
		System.out.println("Enter first array index");
		int size1 = s.nextInt();
		int[] a1 = generateArray(size1);

		System.out.println("Enter second array index");
		int size2 = s.nextInt();
		int[] a2 = generateArray(size2);

		System.out.println("Arrays are");
		printArray(a1);
		printArray(a2);

		System.out.println("\nIndexes to insert second array's elements into the first one");
		printArray(insert(a1, a2));

	}

}
