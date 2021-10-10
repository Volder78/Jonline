package by.epam.module2.decomposition;

//Написать метод, определяющий, в каком из данных двух чисел больше цифр

import java.util.Scanner;

public class Task11 {

	public static int getDigitsNumber(int x) {
		int count = 0;
		while (x > 0) {
			count++;
			x /= 10;
		}
		return count;
	}

	public static int hasMoreDigits(int x, int y) {
		int hasMore;
		if (getDigitsNumber(x) > getDigitsNumber(y)) {
			hasMore = x;
		} else {
			hasMore = y;
		}
		return hasMore;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = s.nextInt();
		System.out.println("Enter second number");
		int y = s.nextInt();

		if (getDigitsNumber(x) == getDigitsNumber(y)) {
			System.out.println("Number of figures is equal");
		} else {
			System.out.println("\n" + hasMoreDigits(x, y) + " has more figures");
		}

	}

}
