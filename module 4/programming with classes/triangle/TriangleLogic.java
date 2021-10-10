package by.epam.classprog.triangle;

public class TriangleLogic {

	private static double[] getTriangleSides(Triangle tr) {
		double a;
		double b;
		double c;

		a = getLength(tr.getA(), tr.getB());
		b = getLength(tr.getB(), tr.getC());
		c = getLength(tr.getA(), tr.getC());

		double[] triangleSides = new double[3];

		triangleSides[0] = a;
		triangleSides[1] = b;
		triangleSides[2] = c;

		return triangleSides;
	}

	private static double getLength(Point a, Point b) {

		return Math.sqrt(Math.pow((a.getX() - b.getX()), 2) + Math.pow((a.getY() - b.getY()), 2));
	}

	public double getArea(Triangle tr) {
		double[] triSides = getTriangleSides(tr);
		double halfPer;

		halfPer = (triSides[0] + triSides[1] + triSides[2]) / 2;

		return Math.sqrt(halfPer * (halfPer - triSides[0]) * (halfPer - triSides[1]) * (halfPer - triSides[2]));
	}

	public double getPerimeter(Triangle tr) {
		double[] triSides;
		triSides = getTriangleSides(tr);

		return triSides[0] + triSides[1] + triSides[2];
	}
	
	public Point getMedianCrossing(Triangle tr) {
		double x;
		double y;
		
		x = (tr.getA().getX() + tr.getB().getX() + tr.getC().getX()) / 3;
		y = (tr.getA().getY() + tr.getB().getY() + tr.getC().getY()) / 3;
		
		Point medianCrossing = new Point(x, y);
		
		return medianCrossing;
	}

}
