package by.jonline.aggr_and_comp.car.entity;

public class Wheel {

	private int size;
	private boolean isBad;

	public Wheel() {
		size = 0;
		isBad = false;
	}

	public Wheel(boolean isBad) {
		this.isBad = isBad;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean getBad() {
		return isBad;
	}

	public void setIsBad(boolean isBad) {
		this.isBad = isBad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isBad ? 1231 : 1237);
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wheel other = (Wheel) obj;
		if (isBad != other.isBad)
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [size=" + size + ", isBad=" + isBad + "]";
	}

}
