package by.epam.module2.decomposition;

import java.util.Scanner;

//Найти все числа Армстронга от 1 до k

public class Task14 {

	public static int power(int a, int b) {
		int res = 1;
		for (int i = 1; i <= b; i++) {
			res *= a;
		}
		return res;
	}

	public static int getDigit(int num, int n) {
		return (int) ((num / Math.pow(10, n - 1)) % 10);
	}

	public static int getNumOfDigit(int num) {
		int size = 0;
		while (num > 0) {
			size++;
			num /= 10;
		}
		return size;
	}

	public static boolean isArmstrong(int num) {
		int sum = 0;
		int numOfDigits = getNumOfDigit(num);
		for (int i = 1; i <= numOfDigits; i++) {
			sum += power(getDigit(num, i), numOfDigits);
		}
		return sum == num;
	}

	public static void printArmstrong(int num) {
		for (int i = 1; i <= num; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter k");
		int k = s.nextInt();

		printArmstrong(k);

	}

}
