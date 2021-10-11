package by.epam.module3.asobject;

import java.util.Scanner;

//осчитать кол-во строчных и прописных букв во введенной строке (только англ)

public class Task9 {

	public static boolean isLowerCase(char c) {
		return c >= 'a' && c <= 'z';
	}

	public static boolean isUpperCase(char c) {
		return c >= 'A' && c <= 'Z';
	}

	public static int countLowerCase(String s) {
		int num = 0;

		for (int i = 0; i < s.length(); i++) {
			if (isLowerCase(s.charAt(i))) {
				num++;
			}
		}
		return num;
	}

	public static int countUpperCase(String s) {
		int num = 0;

		for (int i = 0; i < s.length(); i++) {
			if (isUpperCase(s.charAt(i))) {
				num++;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line: ");
		String line = sc.nextLine();

		int numLow = countLowerCase(line);
		int numUp = countUpperCase(line);

		System.out.println(numLow + " lower case letters");
		System.out.println(numUp + " upper case letters");

	}

}
