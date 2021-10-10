package by.epam.module2.decomposition;

import java.util.Scanner;

//Написать метод (методы) для нахождения НОД и НОК двух натуральных чисел

public class Task1 {

	public static int enterCheck() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int value;
		System.out.println("Enter 'A' and 'B' to compute their GCD and LCM");
		do {
			// System.out.println("Positive integers!");
			while (!s.hasNextInt()) {
				System.out.println("Integers only!");
				s.next();
			}
			value = s.nextInt();
		} while (value == 0);
		// System.out.println("Numbers OK!");
		System.out.println();
		return value;
	}

	public static int greatestCommonDivider(int a, int b) {
		if (b == 0) {
			return Math.abs(a);
		} else {
			return greatestCommonDivider(b, a % b);
		}
	}

	public static int leastCommonMultiplier(int a, int b) {
		return Math.abs((a * b) / greatestCommonDivider(a, b));
	}

	public static void main(String[] args) {
		int a = enterCheck();
		int b = enterCheck();
		System.out.println("GCD(" + a + "," + b + ") = " + greatestCommonDivider(a, b));
		System.out.println("LCM(" + a + "," + b + ") = " + leastCommonMultiplier(a, b));

	}

}
