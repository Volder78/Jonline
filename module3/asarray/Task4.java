package by.epam.module3.asarray;

import java.util.Scanner;

//В строке найти кол-во чисел

public class Task4 {

	public static boolean digit(char c) {
		return c >= '1' && c <= '9';
	}

	public static int calcNumbers(String s) {
		int num = 0;
		boolean previous = false;

		for (int i = 0; i < s.length(); i++) {
			if (digit(s.charAt(i))) {
				if (!previous) {
					num++;
				}
				previous = true;
			} else {
				previous = false;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line: ");

		String line = s.nextLine();
		int num = calcNumbers(line);

		System.out.println("\nThere are " + num + " number(s) here");

	}

}
