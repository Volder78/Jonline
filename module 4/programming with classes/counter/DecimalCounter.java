package by.epam.classprog.counter;

/*
	Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
	на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и 
	произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод 
	позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
*/


public class DecimalCounter {

	private int currentState;
	private int minimum;
	private int maximum;

	public DecimalCounter() {
		this.currentState = 0;
		this.minimum = -10;
		this.maximum = 10;

	}

	public DecimalCounter(int currentState, int minimum, int maximum) {
		this.currentState = currentState;
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getCurrentState() {
		return currentState;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	public void increment() {
		if (currentState < maximum) {
			currentState++;
		} else {
			System.out.println("Impossible to increase");
		}
	}

	public void decrement() {
		if (currentState > minimum) {
			currentState--;
		} else {
			System.out.println("Impossible to decrease");
		}
	}

	public void getCurrent() {
		System.out.println("Current state: " + currentState);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result + currentState;
		result = prime * result + minimum;
		result = prime * result + maximum;

		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		DecimalCounter other = (DecimalCounter) obj;
		if (currentState != other.currentState) {
			return false;
		}
		if (minimum != other.minimum) {
			return false;
		}
		if (maximum != other.maximum) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "currentState = " + currentState + ", minimum = " + minimum + ", maximum = "
				+ maximum + "]";
	}

}
