package by.epam.classprog.triangle;

/*
	Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления 
	площади, периметра и точки пересечения медиан 
*/

public class Triangle {

	private Point a;
	private Point b;
	private Point c;

	public Triangle() {

	}

	public Triangle(Point a, Point b, Point c) {
		if(!isReal(a, b, c)) {
			System.out.println("Triangle with these points doesn't exhist");
		} else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public Point getC() {
		return c;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public void setC(Point c) {
		this.c = c;
	}

	private boolean isReal(Point a, Point b, Point c) {
		if (a.equals(b) || b.equals(c) || c.equals(a)) {
			return false;
		}
		if ((c.getX() - a.getX()) * (b.getY() - a.getY()) == (c.getY() - a.getY()) * (b.getX() - a.getX())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [a = " + a + "; b = " + b + "; c = " + c + "]";
	}

}
