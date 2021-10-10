package by.jonline.aggr_and_comp.state.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {
	
	private String regionName;
	private City regionCap;
	private List<District> districts;
	
	public Region() {
		regionName = "";
		regionCap = new City();
		districts = new ArrayList<District>();
	}
	
	public Region(String regionName, City regionCap) {
		this.regionName = regionName;
		this.regionCap = regionCap;
	}
	
	public Region(String regionName, City regionCap, List<District> districts) {
		this.regionName = regionName;
		this.regionCap = regionCap;
		this.districts = districts;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public City getRegionCap() {
		return regionCap;
	}

	public void setRegionCap(City regionCap) {
		this.regionCap = regionCap;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((regionCap == null) ? 0 : regionCap.hashCode());
		result = prime * result + ((regionName == null) ? 0 : regionName.hashCode());
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
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (regionCap == null) {
			if (other.regionCap != null)
				return false;
		} else if (!regionCap.equals(other.regionCap))
			return false;
		if (regionName == null) {
			if (other.regionName != null)
				return false;
		} else if (!regionName.equals(other.regionName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [regionName=" + regionName + ", regionCap=" + regionCap + ", districts=" + districts + "]";
	}
	
	

}
