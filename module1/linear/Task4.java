package by.epam.module1.linear;

/*   Дано действительное число R вида nnn.ddd.  
 *   Поменять местами дробную и целую части числа, 
 *   вывести полученный результат
 */

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a double in 'ddd,nnn' format");

		double start;
		double f;
		double s;
		double res;
		
		start = scan.nextDouble();
		f = (int) start;
		s = (int) ((start - f) * 1000);
		
		res = (s + f * 0.001);

		System.out.println(res);

	}
}
