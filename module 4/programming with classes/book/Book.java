package by.epam.classprog.book;

/*

	Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и 
	метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и 
	методами. Задать критерии выбора данных и вывести эти данные на консоль.  
 
	     Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.  
	     Найти и вывести:  
	     a) список книг заданного автора;  
	     b) список книг, выпущенных заданным издательством;  
	     c) список книг, выпущенных после заданного года
*/

public class Book {

	private int id;
	private String title;
	private String author;
	private String publisher;
	private int yearPublished;
	private int numOfPages;
	private double price;
	private String binding;

	public Book() {
		id = 0;
		title = "";
		author = "";
		publisher = "";
		yearPublished = 0;
		numOfPages = 0;
		price = 0.0;
		binding = "";
	}

	public Book(int id, String title, String author, String publisher, int yearPublished, int numOfPages, double price,
			String binding) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.numOfPages = numOfPages;
		this.price = price;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public double getPrice() {
		return price;
	}

	public String getBinding() {
		return binding;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-45s %-25s %-20s %-10s %-10s %-10s %-10s", id, title, author, publisher,
				yearPublished, numOfPages, price, binding);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((binding == null) ? 0 : binding.hashCode());
		result = prime * result + id;
		result = prime * result + numOfPages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublished;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (binding == null) {
			if (other.binding != null)
				return false;
		} else if (!binding.equals(other.binding))
			return false;
		if (id != other.id)
			return false;
		if (numOfPages != other.numOfPages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}

}
