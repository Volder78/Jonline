package by.epam.module2.decomposition;

//Написать метод (методы) для нахождения НОД и НОК двух натуральных чисел

import java.util.Scanner;

public class Task1a {

	public static int greatestCommonDiv(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;
	}

	public static int leastCommonMult(int a, int b) {
		return Math.abs((a * b) / greatestCommonDiv(a, b));
	}

	public static void main(String[] args) {
		System.out.println("Enter A");
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter B");
		int b = s.nextInt();

		System.out.println("GCD(" + a + "," + b + ") = " + greatestCommonDiv(a, b));
		System.out.println("LCM(" + a + "," + b + ") = " + leastCommonMult(a, b));
	}

}
