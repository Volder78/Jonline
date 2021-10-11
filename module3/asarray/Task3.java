package by.epam.module3.asarray;

//В строке найти кол-во цифр

import java.util.Scanner;

public class Task3 {

	public static boolean digit(char c) {
		return c >= '1' && c <= '9';
	}

	public static int calcDigits(String s) {
		int number = 0;

		for (int i = 0; i < s.length(); i++) {
			if (digit(s.charAt(i))) {
				number++;
			}
		}
		return number;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line:");

		String line = s.nextLine();

		int num = calcDigits(line);

		System.out.println("\nNumber of digits here is " + num);

	}

}
