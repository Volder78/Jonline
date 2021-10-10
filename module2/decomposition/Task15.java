package by.epam.module2.decomposition;

import java.util.Scanner;

//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность

public class Task15 {

	public static int getNumOfDigits(int n) {
		int size = 0;
		while (n > 0) {
			size++;
			n /= 10;
		}
		return size;
	}

	public static int getDigit(int number, int n) {
		return (int) ((number / Math.pow(10, n - 1)) % 10);
	}

	public static boolean isIncreasing(int n) {
		boolean increasing = true;
		int num = getNumOfDigits(n);
		while (num > 1) {
			if (getDigit(n, num) >= getDigit(n, num - 1)) {
				increasing = false;
				break;
			}
			num--;
		}
		return increasing;
	}

	public static void printSequence(int n) {
		int start = (int) Math.pow(10, n - 1);
		int end = (int) Math.pow(10, n) - 1;
		int num = 0;
		System.out.println("\n" + n + "-figured numbers forming increasing sequence");

		for (int i = start; i <= end; i++) {
			if (isIncreasing(i)) {
				System.out.print(i + " ");
				num++;
			}
			if (num > 11) {
				System.out.println();
				num = 0;
			}
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 'n'");
		int n = s.nextInt();

		printSequence(n);

	}

}
