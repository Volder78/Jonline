package by.epam.module2.array;

//В массиве целых чисел с количеством эл-тов n найти наиболее часто встречающееся число. 
//Если их несколько, то определить min из них


import java.util.Random;

public class Task9 {

	public static void main(String[] args) {

		int n = 10;
		int a[] = new int[n];
		Random r = new Random();

		System.out.println("Initial array");

		for (int i = 0; i < n; i++) {
			a[i] = r.nextInt(20);
			System.out.print(a[i] + " ");
		}
		getMinOfMax(a);
	}

	public static void getMinOfMax(int a[]) {

		int[] freq = new int[a.length];
		int freqCount = 0;

		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == num) {
					count++;
				}
			}
			freq[i] = count;
			if (count > freqCount) {
				freqCount = count;
			}
		}
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == freqCount && a[i] < result) {
				result = a[i];
			}
		}
		System.out.println();
		System.out.println("\nMinimum of repeated numbers is: " + result);
	}
}