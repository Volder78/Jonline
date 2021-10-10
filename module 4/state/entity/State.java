package by.jonline.aggr_and_comp.state.entity;

/*
	Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль 
	столицу, количество областей, площадь, областные центры
*/

import java.util.ArrayList;
import java.util.List;

public class State {
	
	private String stateName;
	private City capital;
	private double area;
	private List<Region> regions;
	
	public State () {
		stateName = "";
		capital = new City();
		area = 0.0;
		regions = new ArrayList<Region>();
	}
	
	public State(String stateName, City capital, double area, List<Region> regions) {
		super();
		this.stateName = stateName;
		this.capital = capital;
		this.area = area;
		this.regions = regions;
	}
	
	public State(String stateName, City capital, double area) {
		this.stateName = stateName;
		this.capital = capital;
		this.area = area;
		regions = new ArrayList<Region>();
	}
	
	public String getStateName() {
		return stateName;
	}
	
	public City getCapital() {
		return capital;
	}
	
	public double getArea() {
		return area;
	}
	
	public List<Region> getRegions() {
		return regions;
	}
	
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	public void setCapital(City capital) {
		this.capital = capital;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
		result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
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
		State other = (State) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return stateName + capital + area + regions;
	}
	
	

}
