package by.epam.module2.decomposition;

import java.util.Scanner;

//Написать метод (методы) нахождения наибольшего общего делителя 4х натуральных чисел

public class Task2 {
	
	public static int greatestCommonDivOfTwo(int a, int b) {
		while(a != 0 && b != 0) {
			if(a > b) {
				a = a % b;
			}
			else {
				b = b % a;
			}
		}
		return a + b;
	}
	
	public static int greatestCommonDivOfFour(int a, int b, int c, int d) {
		int gcd = greatestCommonDivOfTwo(a,b);
		gcd = greatestCommonDivOfTwo(gcd, c);
		gcd = greatestCommonDivOfTwo(gcd, d);
		
		return gcd;
	}
	

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter four numbers to calculate their GCD");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		
		System.out.println();
		System.out.println("GCD(" + a + "," + b + "," + c + "," + d + ") = " + greatestCommonDivOfFour(a,b,c,d));
		
	

	}

}
