package by.epam.module2.array;

//Даны действительные числа a1,a2,...a2n. Найти max (a1+a2n, a2+a2n-1...an+an+1)

public class Task7 {
	
	public static void main(String[] args) {
		
		double a[] = { 12.2, 7.5, -2.0, 65.1, 10.5, -14.6, 2.9, -60.6 };
		double max = a[0] + a[a.length - 1];
		
		for (int i = 1; i < a.length / 2; i++) {
			
			if (a[i] + a[a.length - 1 - i] > max)
				max = a[i] + a[a.length - 1 - i];
		}
		System.out.println(max);

	}

}
