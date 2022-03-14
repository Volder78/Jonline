package by.epam.module3.asobject;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран
// Случай, когда самых длинных слов может быть несколько не обрабатывать

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in).useDelimiter("\n");
		System.out.println("Enter a line of text: ");

		String s = in.next();

		int wStart = 0;
		int wLength = 0;
		int start = 0;
		int length = 0;

		for (int i = 0; i < s.length(); i++) {
			if (!Character.isWhitespace(s.charAt(i))) {
				if (0 == length)
					start = i;
				length++;
				if (length > wLength) {
					wStart = start;
					wLength = length;
				}
			} else {
				length = 0;
			}
		}
		System.out.println("The longest word is: ");
		System.out.print(s.substring(wStart, wStart + wLength));
	}

}
