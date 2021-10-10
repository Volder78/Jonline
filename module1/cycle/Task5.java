package by.epam.module1.cycle;

/*   Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых 
 *   больше или равен заданному е
 */

public class Task5 {

	public static void main(String[] args) {

		double sum = 0.0;
		double e = 0.001;
		double an = 0.0;
		int n = 10; // couldn't create a better way of an array substitution)

		for (int i = 1; i <= n; i++) {
			an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

			if (Math.abs(an) >= e) {
				sum += an;
			}
		}
		System.out.println("Sum is " + sum);
	}
}
