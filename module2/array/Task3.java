package by.epam.module2.array;

//Дан массив действительных чисел размерностью N. Подсчитать, сколько в нем положительных, 
//отрицательных и нулевых элементов

public class Task3 {

	public static void main(String[] args) {
		
		int n = 10;
		int pos = 0;
		int neg = 0;
		int zer = 0;
		double a[] = new double[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = Math.random() * 400 - 200;
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < n; i++) {
			if (a[i] > 0) {
				pos++;
			} else if (a[i] < 0) {
				neg++;
			} else
				zer++;
		}
		System.out.println(pos + " positives, " + neg + " negatives, " + zer + " zero");
	}
}
