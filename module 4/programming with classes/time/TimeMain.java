package by.epam.classprog.time;

public class TimeMain {

	public static void main(String[] args) {
		
		Time time1 = new Time(5, 10, 20);
		Time time2 = new Time(23716);
		Time time3 = new Time();
		
		System.out.println(time1.toString());
		System.out.println(time2.toString());
		System.out.println(time3.toString());
		System.out.println();
		
		time1.addHours(4);
		System.out.println(time1.toString());
		
		time2.addSeconds(86401);
		System.out.println(time2.toString());
		
		time3.addMinutes(1441);
		System.out.println(time3.toString());
		
		time1.setHours(10);
		time1.setMinutes(-34);
		System.out.println(time1.toString());
		
		
		
	}	

}
