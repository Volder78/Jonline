package by.jonline.aggr_and_comp.bank.logic;

import java.util.List;

import by.jonline.aggr_and_comp.bank.entity.Account;
import by.jonline.aggr_and_comp.bank.entity.Client;

public class AccountLogic {

	public void blockAccount(Account account) {

		final double BLOCK_LIMIT = -500;
		if (account.getBalance() <= BLOCK_LIMIT) {
			account.block();
		} else {
			account.unblock();
		}
	}

	public Account accountSearch(Client client, int id) {
		for (Account account : client.getAccounts()) {
			if (account.getId() == id) {
				return account;
			}
		}
		return null;
	}

	public void sortAccounts(Client client) {
		List<Account> accounts = client.getAccounts();

		for (int i = accounts.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (accounts.get(j).getBalance() > accounts.get(j + 1).getBalance()) {
					Account temp = accounts.get(j);
					accounts.remove(j);
					accounts.add(j, accounts.get(j));
					accounts.remove(j + 1);
					accounts.add(j + 1, temp);

				}
			}
		}
	}

	public double getTotalSum(Client client) {
		double total = 0;

		for (Account account : client.getAccounts()) {
			total += account.getBalance();
		}
		return total;
	}

	public double getPositiveSum(Client client) {
		double total = 0;

		for (Account account : client.getAccounts()) {
			if (account.getBalance() > 0) {
				total += account.getBalance();
			}
		}
		return total;
	}

	public double getNegativeSum(Client client) {
		double total = 0;

		for (Account account : client.getAccounts()) {
			if (account.getBalance() < 0) {
				total += account.getBalance();
			}
		}
		return total;
	}

}
