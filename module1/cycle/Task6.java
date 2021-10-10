package by.epam.module1.cycle;

//   Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

public class Task6 {

	public static void main(String[] args) {

		for (int i = 32; i <= 126; i++) {
			System.out.println(i + " " + (char) i);
		}
	}
}
