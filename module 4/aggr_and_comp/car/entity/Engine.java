package by.jonline.aggr_and_comp.car.entity;

public class Engine {

	private boolean isActive;

	public Engine() {
		isActive = false;
	}

	public Engine(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isActive ? 1231 : 1237);
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
		Engine other = (Engine) obj;
		if (isActive != other.isActive)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [isActive=" + isActive + "]";
	}

}
