package by.epam.module3.asobject;

// Вводится строка. Требуется удалить из нее повторяющиеся символы и пробелы

import java.util.Scanner;

public class Task7 {
	
	public static String removeRepeating(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			String s1 = s.substring(i, i + 1);
			if(!s1.equals(" ") && sb.indexOf(s1) == -1) {
				sb.append(s1);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a line: ");
		
		String line = s.nextLine();
		
		String changedLine = removeRepeating(line);
		System.out.println("\nLine after change: " + changedLine);
		
		
	}

}
