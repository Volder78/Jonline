package by.epam.classprog.book;

import java.util.ArrayList;
import java.util.List;

public class BookLogic {

	public List<Book> getBooksByAuthor(BookCase bookcase, String author) {

		List<Book> booksByAuthor = new ArrayList<Book>();

		for (int i = 0; i < bookcase.getBookList().size(); i++) {
			Book book;
			book = bookcase.getBookList().get(i);

			if (book.getAuthor() == author) {
				booksByAuthor.add(book);
			}
		}
		return booksByAuthor;
	}

	public List<Book> getBooksByPublisher(BookCase bookcase, String publisher) {

		List<Book> booksByPublisher = new ArrayList<Book>();

		for (int i = 0; i < bookcase.getBookList().size(); i++) {
			Book book;
			book = bookcase.getBookList().get(i);

			if (book.getPublisher() == publisher) {
				booksByPublisher.add(book);
			}
		}
		return booksByPublisher;
	}

	public List<Book> getBooksByYear(BookCase bookcase, int yearPublished) {

		List<Book> booksByYear = new ArrayList<Book>();

		for (int i = 0; i < bookcase.getBookList().size(); i++) {
			Book book;
			book = bookcase.getBookList().get(i);

			if (book.getYearPublished() > yearPublished) {
				booksByYear.add(book);
			}
		}
		return booksByYear;
	}

}
