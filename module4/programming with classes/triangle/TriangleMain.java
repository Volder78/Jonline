package by.epam.classprog.triangle;

public class TriangleMain {

	public static void main(String[] args) {
		Point a = new Point(-8.6, 2);
		Point b = new Point(6, 3.5);
		Point c = new Point(-2.2, -4);
		
		Triangle tr = new Triangle(a, b, c);
		TriangleLogic logic = new TriangleLogic();
		
		System.out.printf("Area of %s = %2.2f\n", tr, logic.getArea(tr));
		System.out.printf("Perimeter of %s = %2.2f\n", tr, logic.getPerimeter(tr));
		System.out.println("Medians' crossing point of " + tr + " = " +  logic.getMedianCrossing(tr));
		
		
	}

}
