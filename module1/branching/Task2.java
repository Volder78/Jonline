package by.epam.module1.branching;

//   Найти max{min(a,b), min(c,d)}

public class Task2 {

	public static void main(String[] args) {
		int a = 15;
		int b = -4;

		int m1 = Math.min(a, b);
		int c = 4;
		int d = -7;

		int m2 = Math.min(c, d);
		int max = Math.max(m1, m2);

		System.out.println(max);
	}
}
