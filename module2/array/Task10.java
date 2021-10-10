package by.epam.module2.array;

//Дан целочисленный массив с кол-вом эл-тов n. Сжать массив, выбросив из него каждый второй элемент 
//(освободившиеся эл-ты заполнить нулями). Доп.массив не использовать

import java.util.Random;

import java.util.Scanner;

public class Task10 {

	public static int enter() {

		int val;

		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of array elements ");

		while (!s.hasNextInt()) {
			s.next();
			System.out.print("Integer only!");
		}
		val = s.nextInt();
		return val;

	}

	public static void main(String[] args) {

		int n;
		n = enter();
		int arr[] = new int[n];

		Random r = new Random();

		System.out.println("Initial array ");
		for (int i = 0; i < n; i++) {
			arr[i] = r.nextInt(20);
			System.out.print(arr[i] + " ");

		}
		System.out.println("\nArray after change ");

		for (int i = 0; i < n; i++) {
			if (i % 2 != 0) {
				arr[i] = 0;

			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
