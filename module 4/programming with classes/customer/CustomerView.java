package by.epam.classprog.customer;

import java.util.List;

public class CustomerView {

	public void printCustomerList(CustomerList customers) {

		System.out.println("Список покупателей: ");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		for (Customer customer : customers.getCustomers()) {
			System.out.println(customer.toString());
		}
		System.out.println();
	}

	public void printCustomerList(List<Customer> customers) {

		System.out.println("Cписок покупателей: ");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
		System.out.println();
	}

}
