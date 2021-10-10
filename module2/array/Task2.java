package by.epam.module2.array;

//Дана последовательность действительных чисел. Заменить все ее члены большие данного Z, этим числом.
//Подсчитать количество замен

public class Task2 {

	public static void main(String[] args) {

		double a[] = { 23.4, -15.876, 99.0, -456.23, 1.5, 100.75, -2.2 };
		double z = -2.0;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count++;
			}
			System.out.print(a[i] + "\t");
		}
		System.out.print("\n" + count + " substitutions were made.");
	}
}
