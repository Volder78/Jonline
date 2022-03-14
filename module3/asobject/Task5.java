package by.epam.module3.asobject;

import java.util.Scanner;

// Подсчитать, сколько раз среди символов заданной строки встречается буква 'a'

public class Task5 {

	public static int numOfCharacters(String s, char sym) {
		int num = 0;
		int index = 0;

		s = s.toLowerCase();

		while (true) {
			index = s.indexOf(sym, index);
			if (index != -1) {
				num++;
				index++;
			} else {
				break;
			}
		}

		return num;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line: ");

		String line = s.nextLine();
		char sym = 'a';

		int num = numOfCharacters(line, sym);
		System.out.println("\nSymbol 'a' is used here for " + num + " time(s)");

	}

}
