package by.epam.classprog.test2;

/*
Создайте  класс Test2  двумя  переменными.  Добавьте  конструктор  с  входными  параметрами.  Добавьте 
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра 
класса.
*/

public class Test2 {
	
	private double number1;
	private double number2;
	
	public Test2() {
		number1 = 0.0;
		number2 = 0.0;
	}
	
	public Test2(double value1, double value2) {
		number1 = value1;
		number2 = value2;
	}
	
	public void setNumber1(double value) {
		number1= value;
	}
	
	public void setNumber2(double value) {
		number2 = value;
	}
	
	public double getNumber1() {
		return number1;
	}
	
	public double getNumber2() {
		return number2;
	}

}
