package by.epam.module2.decomposition;

import java.util.Scanner;

//Определить сумму n-значных чисел, сoдержащих только нечетные цифры. Посчитать кол-во четных цифр в найденной сумме

public class Task16 {

	public static int getNumOfDigits(long n) {
		int size = 0;
		while (n > 0) {
			size++;
			n /= 10;
		}
		return size;
	}

	public static int getDigit(long num, int n) {
		return (int) ((num / Math.pow(10, n - 1)) % 10);
	}

	public static boolean hasOdds(int n) {
		int num = getNumOfDigits(n);
		boolean odd = true;
		while (num > 0) {
			if (getDigit(n, num) % 2 == 0) {
				odd = false;
				break;
			}
			num--;
		}
		return odd;
	}

	public static long sumWithOdds(int n) {
		int start = (int) Math.pow(10, n - 1);
		int end = (int) Math.pow(10, n) - 1;
		long sum = 0;
		for (int i = start; i <= end; i++) {
			if (hasOdds(i)) {
				sum += i;
			}
		}
		return sum;
	}

	public static int calculateEvens(long n) {
		int numOfDigits = getNumOfDigits(n);
		int numOfEven = 0;
		while (numOfDigits > 0) {
			if (getDigit(n, numOfDigits) % 2 == 0) {
				numOfEven++;
			}
			numOfDigits--;
		}
		return numOfEven;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 'n'");
		int n = s.nextInt();

		long sum = sumWithOdds(n);
		System.out.println("\nSum = " + sum + ", number of evens = " + calculateEvens(sum));

	}

}
