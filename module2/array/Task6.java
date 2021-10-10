package by.epam.module2.array;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел,порядковые номера которых 
//являются простыми числами

public class Task6 {

	public static void main(String[] args) {

		double a[] = { 12.6, 5.8, 6.5, 3.0, 23.9, 1.0, 1.9, 5.7, 8.8, 2.5 };
		double sum = 0;

		System.out.println("For array ");

		for (int i = 0; i < a.length; i++) {
			// a[i] = Math.random()*100 - 30;
			System.out.print(a[i] + "    ");
		}
		for (int i = 2; i < a.length; i++) {
			if ((i % 2 != 0) && (i % 3 != 0) && (i % 5 != 0)) {
				sum += a[i];
			}
		}
		System.out.print("\nSum is " + sum);
	}
}
