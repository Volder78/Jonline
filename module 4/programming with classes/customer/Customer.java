package by.epam.classprog.customer;

/*
	Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы 
	и метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами 
	и методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 
       Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.  
       Найти и вывести:  
       a) список покупателей в алфавитном порядке;  
       b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String secondName;
	private String address;
	private int cardNumber;
	private int bankAccount;

	public Customer() {
		id = 0;
		surname = "";
		name = "";
		secondName = "";
		address = "";
		cardNumber = 0;
		bankAccount = 0;
	}

	public Customer(int id, String surname, String name, String secondName, String address, int cardNumber,
			int bankAccount) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.secondName = secondName;
		this.address = address;
		this.cardNumber = cardNumber;
		this.bankAccount = bankAccount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	public int getId() {
		return id;
	}

	public String getSurname() {
		return surname;
	}

	public String getName() {
		return name;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getAddress() {
		return address;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	@Override
	public String toString() {
		return String.format("%-12s %-15s %-15s %-20s %-24s %-10s %-10s", id, surname, name, secondName, address,
				cardNumber, bankAccount);
	}

}
