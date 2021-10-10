package by.epam.module2.decomposition;

//Написать метод вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Task7 {
	
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}
	
	public static int calculateSum(int start, int end) {
		int sum = 0;
		if(start % 2 == 0) {
			start ++;
		}
		for(int i = start; i <= end; i += 2) {
			sum += fact(i);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Sum of factorials of odd numbers from 1 to 9 = " + calculateSum(1, 9));
	
	}

}
