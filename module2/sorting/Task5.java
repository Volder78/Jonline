package by.epam.module2.sorting;

//Сортировка вставками

public class Task5 {

	public static int binarySearchPosition(int[] a) {
		int index = 0;

		for (int i = 1; i < a.length; i++) {
			int temp;
			for (int j = 1; j < a.length - i; j++) {
				if (a[j] > a[j + 1]) {

					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					index += i;
				}

			}

		}
		return index;

	}

	public static void printArray(int[] a) {
		for (int val : a) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 23, 7, 65, 37, 204, 9 };
		System.out.println("Initial array");

		printArray(a);

		binarySearchPosition(a);

		System.out.println("Array after change");

		printArray(a);

	}

}
