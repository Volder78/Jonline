package by.epam.module2.decomposition;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника

public class Task3 {
	
	public static double triangleSq(int a) {
		double s = ( Math.sqrt(3) / 4) * (a*a);
		return s;
				
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Hexagon's square is " + (triangleSq(a)*6));
		
		
	}

}
