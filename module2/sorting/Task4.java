package by.epam.module2.sorting;

//Сортировка обменами (пузырек)

public class Task4 {

	public static void printArray(int[] a) {
		for (int val : a) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 3, 67, 9, 23, 124, 1, 96, 100 };
		System.out.println("Initial array");
		printArray(a);
		boolean isSorted = false;
		int temp;
		int num = 0;
		while (!isSorted) {
			isSorted = true;
			

			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					isSorted = false;
					
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					num ++;
				}

			}
			
		}
		System.out.println("Array after change");
		printArray(a);
		
		System.out.println(num + " exchanges were made");

	}
}
