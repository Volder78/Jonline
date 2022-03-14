package by.epam.module3.asarray;

// Заменить все вхождения 'word' на 'letter'

import java.util.Scanner;

public class Task2 {

	public static boolean theSameWord(String s, int start, String word) {
		boolean isSame;

		if (start + word.length() > s.length()) {
			isSame = false;
		} else {
			isSame = true;
			for (int i = start, index = 0; i < start + word.length(); i++, index++) {
				if (toLowerCase(s.charAt(i)) != toLowerCase(word.charAt(index))) {
					isSame = false;
					break;
				}

			}
		}
		return isSame;
	}

	public static char toLowerCase(char c) {
		if (c >= 'A' && c <= 'Z') {
			c -= 'A' - 'a';
		}
		return c;
	}

	public static String changeWord(String s, String wordOld, String wordNew) {
		StringBuffer b = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {

			if (theSameWord(s, i, wordOld)) {
				b.append(wordNew);
				i += wordOld.length() - 1;
			} else {
				b.append(s.charAt(i));
			}
		}
		return b.toString();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Enter a line; ");
		String line = s.nextLine();

		String wordOld = "word";
		String wordNew = "letter";

		String result = changeWord(line, wordOld, wordNew);

		System.out.println("\nLine after change: ");
		System.out.println(result);

	}

}
