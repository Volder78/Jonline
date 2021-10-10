package by.epam.module1.cycle;

/*   Напишите программу, где пользователь вводит любое целое положительное число. 
 *   А программа суммирует все числа от 1 до введенного пользователем числа
 */

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int count = 1;
		int sum = 0;
		int i;

		System.out.println("Enter a positive integer");

		i = scan.nextInt();

		while (count < i) {
			sum += count;
			count++;
		}
		System.out.println("Sum of previous figures is " + sum);

	}
}
