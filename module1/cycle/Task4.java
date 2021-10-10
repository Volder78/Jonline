package by.epam.module1.cycle;

//   Составить программу нахождения произведения квадратов первых двухсот чисел

public class Task4 {

	public static void main(String[] args) {

		long value = 1;
		int i = 2;
		boolean isOver = false;

		while (i <= 200 && !isOver) {
			value = value * i * i;
			isOver = Long.MAX_VALUE / value < (i + 1) * (i + 1);
			i++;
		}

		if (isOver) {
			System.out.println("The result is over the limit of long numbers!");
			System.out.println("Result of multiplying is for first " + (i - 1) + " numbers:");
		}

		System.out.println(value);

	}
}
