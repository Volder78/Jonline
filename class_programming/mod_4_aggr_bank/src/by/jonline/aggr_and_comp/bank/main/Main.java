package by.jonline.aggr_and_comp.bank.main;

import by.jonline.aggr_and_comp.bank.entity.*;
import by.jonline.aggr_and_comp.bank.logic.AccountLogic;
import by.jonline.aggr_and_comp.bank.view.ClientView;

public class Main {

	public static void main(String[] args) {

		Bank bank = new Bank();
		Client client = new Client("A.Vasilyev");
		ClientView cView = new ClientView();
		AccountLogic aLogic = new AccountLogic();

		bank.addClient(client);

		Account one = new Account(11111, 760.00);
		Account two = new Account(22222, 2.50);
		Account three = new Account(33333, -710.00);

		client.addAccount(one);
		client.addAccount(two);
		client.addAccount(three);

		aLogic.blockAccount(one);
		aLogic.blockAccount(two);
		aLogic.blockAccount(three);

		Account searched = aLogic.accountSearch(client, 22222);
		cView.viewAccount(searched);

		System.out.println("All accounts");
		cView.viewAllAccounts(client);
		aLogic.sortAccounts(client);
		System.out.println("Balance from min to max");
		cView.viewAllAccounts(client);

		double total = aLogic.getTotalSum(client);
		System.out.println("Your total balance is " + total);

		double totalPositive = aLogic.getPositiveSum(client);
		System.out.println("Debit is " + totalPositive);

		double totalNegative = aLogic.getNegativeSum(client);
		System.out.println("Credit is " + totalNegative);

	}

}
