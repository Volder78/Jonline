package by.epam.module3.asarray;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case 

public class Task1 {

	public static boolean isLowerCase(char c) {
		return c >= 'a' && c <= 'z';
	}

	public static char toLowerCase(char c) {
		if (c >= 'A' && c <= 'Z') {
			c -= 'A' - 'a';
		}
		return c;
	}

	public static boolean digit(char c) {
		return c >= '1' && c <= '9';
	}

	public static String[] fromCamelToSnake(String[] s) {
		StringBuilder b = new StringBuilder();

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (isLowerCase(s[i].charAt(j)) || digit(s[i].charAt(j))) {
					b.append(s[i].charAt(j));
				} else {
					b.append('_');
					b.append(toLowerCase(s[i].charAt(j)));
				}

			}
			s[i] = b.toString();
			b = new StringBuilder();
		}
		return s;
	}

	public static void main(String[] args) {
		String s1 = "howAreYou";
		String s2 = "fineThanks";
		String s3 = "goOnSolvingTheProblem";

		String[] name = { s1, s2, s3 };

		fromCamelToSnake(name);

		for (String s : name) {
			System.out.print(s + " ");
		}

	}

}
