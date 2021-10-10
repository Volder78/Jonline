package by.jonline.aggr_and_comp.bank.entity;

/*
	Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
	счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
	всем счетам, имеющим положительный и отрицательный балансы отдельно
*/

public class Account {

	private int id;
	private double balance;
	private boolean isBlocked;

	public Account() {
		id = 0;
		balance = 0.0;
		isBlocked = false;
	}

	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public Account(int id, double balance, boolean isBlocked) {
		this.id = id;
		this.balance = balance;
		this.isBlocked = isBlocked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void block() {
		isBlocked = true;
	}

	public void unblock() {
		isBlocked = false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + (isBlocked ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (id != other.id)
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %-15s", id, balance, isBlocked ? "blocked" : "unblocked");
	}

}
