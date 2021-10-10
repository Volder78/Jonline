package by.epam.module2.array;

//В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

public class Task1 {

	public static void main(String[] args) {

		int[] a = { 5, 12, 970, 45, 73, 2, 25 };
		int k = 3;
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}
		System.out.println("Sum is " + sum);
	}
}
