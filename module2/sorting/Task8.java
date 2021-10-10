package by.epam.module2.sorting;

import java.util.Scanner;

//Даны дроби p1/q1, p2/q2...pn/qn (p, q - натуральные) Привести к общему знаменателю, расположить в порядке возрастания

public class Task8 {

	public static void createFractions(int[] num, int[] den) {
		for (int i = 0; i < den.length; i++) {
			num[i] = (int) (1 + Math.random() * 10);
			den[i] = (int) (2 + Math.random() * 10);
		}
	}

	public static void printFractions(int[] num, int[] den) {
		for (int i = 0; i < den.length; i++) {
			System.out.print(num[i] + "/" + den[i] + " ");
		}
	}

	public static void commonDenominator(int[] num, int[] den) {
		int commonDen = leastCommonMultiplier(den);
		for (int i = 0; i < num.length; i++) {
			num[i] *= commonDen / den[i];
			den[i] = commonDen;
		}
		exchange(num);
	}

	public static void exchange(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					swapElements(a, j, j + 1);
				}

			}
		}
	}

	public static void swapElements(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

	public static int leastCommonMultiplier(int[] a) {
		int nok = a[0];
		for (int i = 1; i < a.length; i++) {
			nok = nok * a[i] / greatestCommonDivider(nok, a[i]);
		}
		return nok;

	}

	public static int greatestCommonDivider(int first, int second) {
		if (second == 0) {
			return Math.abs(first);
		} else {
			return greatestCommonDivider(second, first % second);
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("How many fractions do you expect?");
		int number = s.nextInt();

		if (number > 0) {
			int[] num = new int[number];
			int[] den = new int[number];

			createFractions(num, den);
			System.out.println(number + " fractions created");
			printFractions(num, den);

			commonDenominator(num, den);
			System.out.println("\nSorted fractions with common denominator");
			printFractions(num, den);

		}

	}

}
