package by.epam.module3.asobject;

// Проверить, является ли заданное слово палиндромом

public class Task3 {

	public static boolean isPallindrome(String s) {
		int n = s.length();
		
		for (int i = 0; i < n / 2; i++) {
			if (s.charAt(i) != s.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String line = "madam";

		if (isPallindrome(line)) {
			System.out.println("It's a pallindrome");
		} else {
			System.out.println("It's not a pallindrome");
		}

	}

}
