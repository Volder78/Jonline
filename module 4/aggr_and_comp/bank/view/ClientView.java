package by.jonline.aggr_and_comp.bank.view;

import by.jonline.aggr_and_comp.bank.entity.Account;
import by.jonline.aggr_and_comp.bank.entity.Client;

public class ClientView {

	public void viewAccount(Account account) {
		System.out.printf("%6s %12s %12s\n", "ID", "Bal", "Status");
		System.out.println("-----------------------------------");
		System.out.print("Ac ");
		System.out.println(account.toString());
		System.out.println();
	}

	public void viewAllAccounts(Client client) {
		System.out.printf("%6s %12s %12s\n", "ID", "Bal", "Status");
		System.out.println("-----------------------------------");

		for (Account account : client.getAccounts()) {
			System.out.print("Ac ");
			System.out.println(account.toString());
		}
		System.out.println();
	}

}
