package by.jonline.aggr_and_comp_tour.entity;

import java.util.ArrayList;
import java.util.List;

/*	������������� �������. ������������ ����� ����������� ������� �� ������ ������������� �������
 * 	���������� ���� (�����, �������, ����� � �.�.) ��� ������������ ������.��������� �����������
 * 	������ ����������, �������, ����� ����. ����������� ����� � ���������� �������
 */

public class Agency {

	private List<Tour> tours;

	public Agency() {
		tours = new ArrayList<>();
	}

	public Agency(List<Tour> tours) {
		this.tours = tours;
	}

	public List<Tour> getTours() {
		return tours;
	}

	public void setTours(List<Tour> tours) {
		this.tours = tours;
	}
	
	public void addTour(Tour tour) {
		if(tour != null) {
			tours.add(tour);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tours == null) ? 0 : tours.hashCode());
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
		Agency other = (Agency) obj;
		if (tours == null) {
			if (other.tours != null)
				return false;
		} else if (!tours.equals(other.tours))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Agency [tours=" + tours + "]";
	}

	
}
