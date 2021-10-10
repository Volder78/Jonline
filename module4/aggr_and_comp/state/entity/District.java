package by.jonline.aggr_and_comp.state.entity;

import java.util.ArrayList;
import java.util.List;

public class District {
	
	private String distName;
	private City distCap;
	private List<City> cities;
	
	public District() {
		distName = "";
		distCap = new City();
		cities = new ArrayList<City>();
	}
	
	public District(String distName, City distCap, List<City> cities) {
		this.distName = distName;
		this.distCap = distCap;
		this.cities = cities;
	}

	public String getDistName() {
		return distName;
	}

	public void setDistName(String distName) {
		this.distName = distName;
	}

	public City getDistCap() {
		return distCap;
	}

	public void setDistCap(City distCap) {
		this.distCap = distCap;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((distCap == null) ? 0 : distCap.hashCode());
		result = prime * result + ((distName == null) ? 0 : distName.hashCode());
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
		District other = (District) obj;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (distCap == null) {
			if (other.distCap != null)
				return false;
		} else if (!distCap.equals(other.distCap))
			return false;
		if (distName == null) {
			if (other.distName != null)
				return false;
		} else if (!distName.equals(other.distName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [distName=" + distName + ", distCap=" + distCap + ", cities=" + cities + "]";
	}
	
	

}
