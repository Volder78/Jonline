package by.epam.module1.linear;

//   Вычислить значение по формуле(все переменные принимают действительные значения)

public class Task3 {

	public static void main(String[] args) {

		double x = -3.67;
		double y = 3.67;
		double res;

		res = (Math.sin(x) + Math.cos(y)) / (Math.cos(y) - Math.sin(x)) * Math.tan(x * y);

		System.out.println("x =" + x);
		System.out.println("y = " + y);
		System.out.println("Result is " + res);
	}
}
