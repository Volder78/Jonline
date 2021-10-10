package by.epam.module2.decomposition;

import java.util.Scanner;

//Из заданного числа вычли сумму его цифр, из рез-та снова вычли сумму его цифр.
//Сколько действий надо произвести, чтобы получился 0


public class Task17 {

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public static int howManyTimes(int n) {
		int times = 0;
		while (n > 0) {
			n -= sumOfDigits(n);
			times++;
		}
		return times;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number with 2 or more digits");
		int n = s.nextInt();
		System.out.println(
				"\nYou should subtract from " + "'" + n + "'" + " the sum of its digits " + howManyTimes(n) + " times");

	}

}
