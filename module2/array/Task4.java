package by.epam.module2.array;

//Даны действительные числа. Поменять местами наибольший и наименьший элементы

public class Task4 {

	public static void main(String[] args) {
		
		double a[] = new double[10];
		double max = a[0];
		double min = a[0];
		int maxPos = 0, minPos = 0;
		double temp;
		
		System.out.println("Initial array:");
		
		for (int i = 0; i < a.length; i++) {
			a[i] = Math.random() * 400 - 200;
			System.out.print(a[i] + " ");
			
			if (a[i] > max) {
				max = a[i];
				maxPos = i;
			} else if (a[i] < min) {
				min = a[i];
				minPos = i;
			}
		}
		System.out.println("\n" + max + " is maximum");
		System.out.println(min + " is minimum");
		
		temp = a[minPos];
		a[minPos] = a[maxPos];
		a[maxPos] = temp;
		
		System.out.println("Array after the change:");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
