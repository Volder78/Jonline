package by.epam.classprog.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {

	private List<Customer> customers;

	public CustomerList() {
		customers = new ArrayList<Customer>();
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void addCustomer(Customer customer) {
		if (customer != null) {
			customers.add(customer);
		}
	}

	@Override
	public String toString() {
		if (customers != null) {
			StringBuffer sb = new StringBuffer();
			for (Customer customer : customers) {
				sb.append(customer.toString()).append("\n");
			}
			return sb.toString();
		} else {
			return "Покупатели не найдены!";
		}
	}

}
