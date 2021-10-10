package by.epam.classprog.triangle;

public class Point {

	private double x;
	private double y;

	public Point() {
		x = 0.0;
		y = 0.0;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + (int)x;
		result = PRIME * result + (int)y;
		
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(getClass() != o.getClass()) return false;
		Point p = (Point) o;
		if(x != p.x) return false;
		if(y != p.y) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [x = " + x + "; y = " + y + "]";
	}

}
