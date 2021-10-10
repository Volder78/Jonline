package by.epam.module2.sorting;

//Заданы 2 различных одномерных массива и число k. Объединить их в один массив, включив второй между k и k+1 элементами первого

import java.util.Scanner;
public class Task1 {

	public static int[] arrayCombination(int[] a1, int[] a2, int k) {
		int[] a = new int[a1.length + a2.length];
		int index = 0;
		for (; index < k; index++) {
			a[index] = a1[index];
		}
	
		for (int j = 0; j < a2.length; j++, index++) {
			a[index] = a2[j];
		}
		for (int j = k; j < a1.length; j++, index++) {
			a[index] = a1[j];
		}
		return a;
	}

	public static int[] createArray(int size) {
		
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = (int) (Math.random() * 101);

		} 
		return a;
	} 

	public static void printArray(int[] a) {
		for (int val : a) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first array index");
		int size1 = s.nextInt();
		int[] a1 = createArray(size1);
		
		System.out.println("Enter second array index");
		int size2 = s.nextInt();
		int[] a2 = createArray(size2);
		
		System.out.println("Enter k");
		int k = s.nextInt();
		
		System.out.println("Initial arrays");
		printArray(a1);
		printArray(a2);
		
		int[] array = arrayCombination(a1, a2, k);
		System.out.println("\nArray after combination");
		printArray(array);
		
	}

}
