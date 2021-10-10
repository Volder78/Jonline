package by.epam.module2.sorting;

//Сортировка Шелла

public class Task6 {
	public static void shellSorting(double[] a) {
		int i = 0;
		while (i < a.length - 1) {
			if (a[i] > a[i + 1]) {
				swapTwoElements(a, i, i + 1);
				if (i > 0) {
					i--;
				}

			} else {
				i++;
			}
		}
	}

	public static void swapTwoElements(double[] a, int index1, int index2) {
		double temp;
		temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}

	public static void printArray(double[] a) {
		for (double val : a) {
			System.out.printf("%8.2f", val);
		}
		System.out.println();
	}

	public static void generateArray(double[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (double) (Math.random() * 101 - 51);
		}

	}

	public static void main(String[] args) {
		System.out.println("Initial array");
		double[] a = new double[10];

		generateArray(a);
		printArray(a);

		System.out.println("Array after change");

		shellSorting(a);
		printArray(a);

	}

}
