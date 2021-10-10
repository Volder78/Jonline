package by.epam.classprog.student;

import java.util.Arrays;

/*
	Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
	переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
	наибольшее значение из этих двух переменных.
*/

public class Student {

	private String name;
	private int groupNumber;
	private static final int NUM_OF_MARKS = 5;
	private int[] success = new int[NUM_OF_MARKS];

	public Student() {

	}

	public Student(String name, int groupNumber, int[] success) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.success = success;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setSuccess(int[] success) {
		this.success = success;
	}

	public int[] getSuccess() {
		return success;
	}

	public boolean isExellent() {
		for (int i = 0; i < success.length; i++) {
			if (success[i] < 9) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		}
		if (o == null || o.getClass() != this.getClass()) {
			return false;
		}
		Student s = (Student) o;
		return name == s.name && (groupNumber == s.groupNumber) || (name != null && name.equals(s.getName()));

	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;

		result = PRIME * result + ((name == null) ? 0 : name.hashCode());
		result = PRIME * result + groupNumber;

		return result;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", groupNumber=" + groupNumber + ", success=" + Arrays.toString(success) + "]";
	}

}
