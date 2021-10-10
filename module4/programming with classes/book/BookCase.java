package by.epam.classprog.book;

import java.util.ArrayList;
import java.util.List;

public class BookCase {

	private List<Book> bookList;

	public BookCase() {
		bookList = new ArrayList<Book>();
	}

	public BookCase(List<Book> bookList) {
		this.bookList = bookList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public void addBook(Book book) {
		if (book != null) {
			bookList.add(book);
		}
	}

	@Override
	public String toString() {
		if (bookList != null) {
			StringBuffer sb = new StringBuffer();
			for (Book book : bookList) {
				sb.append(book.toString()).append("\n");
			}
			return sb.toString();
		} else {
			return "No books found!";
		}
	}

}
