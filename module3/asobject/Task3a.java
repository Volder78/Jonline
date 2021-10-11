package by.epam.module3.asobject;

public class Task3a {

	public static boolean isPallindrome(String s) {

		StringBuilder copy = new StringBuilder(s);
		StringBuilder revString = new StringBuilder(copy);

		revString.reverse();

		return copy.toString().equals(revString.toString());
	}

	public static void main(String[] args) {

		String s = "madam";

		if (isPallindrome(s)) {
			System.out.println("It's a pallindrome");
		} else {
			System.out.println("It's not a pallindrome");
		}
	}

}
