package by.epam.module3.asobject;

import java.util.Scanner;

// Посчитать кол-во строчных и прописных букв во введенной строке.
// Учитывать только английские буквы

public class Task10 {

	public static int countSentences(String s) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '.' || c == '!' || c == '?') {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");

		String line = sc.nextLine();

		System.out.println("Number of sentences = " + countSentences(line));
	}

}
