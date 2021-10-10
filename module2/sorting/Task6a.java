package by.epam.module2.sorting;

//Больше похоже на сортировку Шелла

public class Task6a {
	
	public static void shellSorting(double[] a) {
		int in;
		int out;
		double temp;
		int h = 1;
		while (h <= a.length / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (out = h; out < a.length; out++) {
				temp = a[out];
				in = out;
				while (in > h - 1 && a[in - h] >= temp) {
					a[in] = a[in - h];
					in -= h;
				}
				a[in] = temp;

			}
			h = (h - 1) / 3;
		}

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
		double[] a = new double[10];
		System.out.println("Initial array");

		generateArray(a);
		printArray(a);

		System.out.println("Array after change");

		shellSorting(a);
		printArray(a);

	}

}
