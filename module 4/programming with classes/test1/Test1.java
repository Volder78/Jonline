package by.epam.classprog.test1;

/*
	Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
	переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
	наибольшее значение из этих двух переменных.
*/

public class Test1 {

	private int x;
	private int y;

	public Test1() {
		x = 0;
		y = 0;
	}

	public Test1(int value1, int value2) {
		x = value1;
		y = value2;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int value) {
		x = value;
	}

	public void setY(int value) {
		y = value;
	}

	public void printVariables() {
		System.out.println(toString());
	}

	public int sumVariables() {
		return x + y;
	}

	public int getMax() {
		return Math.max(x, y);
	}

	@Override
	public String toString() {
		return "x = " + x + ", y = " + y;
	}

}
