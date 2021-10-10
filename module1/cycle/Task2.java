package by.epam.module1.cycle;

//   Вычислить значения функции на отрезке [а,b] c шагом h

public class Task2 {

	public static void main(String[] args) {
		double a = 0.5;
		double b = 7.0;
		double h = 0.5;
		double y;

		for (double i = a; i <= b; i += h) {

			if (i > 2) {
				y = i;
			} else {
				y = i * (-1);
			}
			System.out.println("If x = " + i + ", y = " + y);
		}
	}
}
