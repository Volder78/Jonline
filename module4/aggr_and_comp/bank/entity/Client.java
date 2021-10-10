package by.jonline.aggr_and_comp.bank.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private List<Account> accounts;

	public Client() {
		name = "";
		accounts = new ArrayList<Account>();
	}

	public Client(String name) {
		this.name = name;
		this.accounts = new ArrayList<Account>();
	}

	public Client(String name, List<Account> accounts) {
		this.name = name;
		this.accounts = accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (account != null) {
			accounts.add(account);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Client other = (Client) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client: name - " + name + ", accounts - " + accounts;
	}

}
