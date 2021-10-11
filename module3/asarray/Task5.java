package by.epam.module3.asarray;

//Удалить в строке все лишние пробелы (идущие подряд заменить на одиночные). Крайние удалить.

import java.util.Scanner;

public class Task5 {

	public static String removeSpaces(String st) {
		StringBuilder b = new StringBuilder();
		boolean prevSpace = true;

		int index = st.length() - 1;
		while (st.charAt(index) == ' ') {
			index--;
		}

		for (int i = 0; i <= index; i++) {
			if (st.charAt(i) == ' ') {
				if (!prevSpace) {
					b.append(st.charAt(i));
				}
				prevSpace = true;
			} else {
				b.append(st.charAt(i));
				prevSpace = false;
			}
		}
		return b.toString();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line: ");

		String line = s.nextLine();
		String newLine = removeSpaces(line);

		System.out.println("\nLine after space removal: ");
		System.out.println(newLine);

	}

}
