package by.epam.classprog.book;

import java.util.List;

public class BookView {

	public void viewBooks(BookCase bookcase) {
		System.out.println("Available books: ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

		for (Book book : bookcase.getBookList()) {
			System.out.println(book.toString());
		}
		System.out.println();
	}

	public void viewSortedBooks(List<Book> books) {
		System.out.println("Available books: ");
		System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");

		for (Book book : books) {
			System.out.println(book.toString());
		}
		System.out.println();

	}

}
