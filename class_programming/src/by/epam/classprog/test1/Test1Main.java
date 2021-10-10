package by.epam.classprog.test1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Test1Main {

	public static void main(String[] args) {
		try {
			Test1 t = new Test1();
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);

			System.out.println("Enter variables x and y ");

			t.setX(s.nextInt());
			t.setY(s.nextInt());

			System.out.println("You've entered: ");
			t.printVariables();

			System.out.println("Sum is " + t.sumVariables());
			System.out.println("Max is " + t.getMax());

		} catch (InputMismatchException e) {
			System.out.println("Entry error! " + e.getMessage());
		}

	}

}
