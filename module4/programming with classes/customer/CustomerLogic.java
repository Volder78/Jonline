package by.epam.classprog.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerLogic {

	public List<Customer> sortByAbc(CustomerList theList) {

		List<Customer> customers;
		customers = new ArrayList<Customer>(theList.getCustomers());

		for (int i = customers.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (customers.get(j).getSurname().compareTo(customers.get(j + 1).getSurname()) > 0) {
					Customer temp;
					temp = customers.get(j);
					customers.remove(j);
					customers.add(j, customers.get(j));
					customers.remove(j + 1);
					customers.add(j + 1, temp);
				}
			}
		}
		return customers;
	}

	public List<Customer> getByCreditCard(CustomerList customers, int start, int end) {
		List<Customer> selectedCustomers = new ArrayList<Customer>();

		for (int i = 0; i < customers.getCustomers().size(); i++) {
			Customer temp = customers.getCustomers().get(i);

			boolean isWithin;
			isWithin = temp.getCardNumber() >= start && temp.getCardNumber() <= end;

			if (isWithin) {
				selectedCustomers.add(temp);
			}
		}
		return selectedCustomers;
	}

}
