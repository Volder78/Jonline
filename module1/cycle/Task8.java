package by.epam.module1.cycle;

//   Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class Task8 {

	public static void main(String[] args) {
		int m = 12345;
		int n = 654321;
		int c, d;

		boolean notEqual = true;

		while (m > 0) {
			d = m % 10;
			m /= 10;
			c = n;

			while (c > 0) {
				if (c % 10 == d) {
					System.out.println("Common digit: " + d);
					notEqual = false;
				}
				c /= 10;
			}
		}

		if (notEqual) {
			System.out.println("No equal digits");
		}
	}
}
