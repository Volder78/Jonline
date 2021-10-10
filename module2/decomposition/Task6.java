package by.epam.module2.decomposition;

import java.util.Scanner;

//Написать метод (методы), проверяющий, являются ли три данных числа взаимно простыми

public class Task6 {
	
	public static int greatestCommonDiv(int a, int b) {
		while (a != 0 && b != 0) {
			if(a > b) {
				a = a % b;
			}
			else {
				b = b % a;
			}
		}
		return a + b;
	}
	
	public static int commonDivOfThree(int a, int b, int c) {
		int gcd = greatestCommonDiv(a, b);
		gcd = greatestCommonDiv(gcd, c);
		
		return gcd;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numbers to check");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(commonDivOfThree(a, b, c) == 1) {
			System.out.println("Relative primes");
		}
		else {
			System.out.println("Not relative primes, GCD is " + commonDivOfThree(a, b, c));
		}
		
		

	}

}
