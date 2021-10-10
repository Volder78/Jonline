package by.epam.module2.decomposition;

import java.util.Scanner;

//Найти и напечатать все пары близнецов из отрезка [n,2n] где n- заданное натуральное число больше 2

public class Task13 {

	public static int calcElements(int min) {
		int max = min * 2;
		int num;
		num = ((max - min) / 2) + 1;
		return num;
	}

	public static int[] createArray(int min) {
		int num = calcElements(min);
		int[] a = new int[num];
		int twin = min;
		for (int i = 0; i < a.length; i++) {
			a[i] = twin;
			twin += 2;
		}
		return a;
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 'n' (> 2)");
		int n = s.nextInt();

		int[] a = createArray(n);

		Task13.print(a);

	}

}
