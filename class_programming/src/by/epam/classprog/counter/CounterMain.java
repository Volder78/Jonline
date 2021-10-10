package by.epam.classprog.counter;

public class CounterMain {

	public static void main(String[] args) {
		
		DecimalCounter counter = new DecimalCounter();
		DecimalCounter counter1 = new DecimalCounter(10, 5, 15);
		
		counter.getCurrent();
		counter.increment();
		counter.increment();
		counter.increment();
		counter.decrement();
		counter.getCurrent();
		
		counter1.decrement();
		counter1.decrement();
		counter1.getCurrent();

	}

}
