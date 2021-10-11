package by.epam.module3.asobject;

import java.util.Scanner;

//ВВодится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его

public class Task8a {

	public static String findTheLongest(String s) {
		String[] phrase = removeSpaces(s).split(" ");
		String longestWord = "";

		for (String x : phrase) {
			if (x.length() >= longestWord.length()) {
				longestWord = x;
			}
		}

		return longestWord;
	}

	public static String removeSpaces(String s) {
		StringBuilder b = new StringBuilder();
		boolean prevSpace = true;

		int lastIndex = s.length() - 1;
		while (s.charAt(lastIndex) == ' ') {
			lastIndex--;
		}
		for (int i = 0; i <= lastIndex; i++) {
			if (s.charAt(i) == ' ') {
				if (!prevSpace) {
					b.append(s.charAt(i));
				}
				prevSpace = true;
			} else {
				b.append(s.charAt(i));
				prevSpace = false;

			}
		}
		return b.toString();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line of text: ");
		String line = s.nextLine();

		String longestWord = findTheLongest(line);

		System.out.println("The longest word is: " + "\n" + longestWord);

	}

}
