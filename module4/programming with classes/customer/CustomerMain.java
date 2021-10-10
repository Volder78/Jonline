package by.epam.classprog.customer;

import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {
		
		CustomerLogic logic = new CustomerLogic();
		CustomerView view = new CustomerView();
		CustomerList theList = new CustomerList();
		
		theList.addCustomer(new Customer(22030405, "��������", "������", "������������", "��.�.�������, 22", 5677, 90807060));
		theList.addCustomer(new Customer(87654321, "�����������", "��������", "����������", "������-�����-�������", 1101, 10101010));
		theList.addCustomer(new Customer(11020304, "��������", "������", "����������", "��.������������. 2", 2345, 10203040));
		theList.addCustomer(new Customer(12345678, "���������", "���������", "�����������", "����������� �������", 012345, 0101010101));
		theList.addCustomer(new Customer(12233445, "�����", "��������", "������������", "������, ������",9999, 90919293));
		
		view.printCustomerList(theList);
		
		List<Customer> sortedCustomers;
		sortedCustomers = logic.sortByAbc(theList);
		view.printCustomerList(sortedCustomers);
		
		List<Customer> byCard;
		byCard = logic.getByCreditCard(theList, 1000, 3000);
		view.printCustomerList(byCard);
		
		

	}

}
