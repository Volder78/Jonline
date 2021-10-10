package by.epam.classprog.book;

import java.util.List;

public class BookMain {

	public static void main(String[] args) {
		
		BookCase bookcase = new BookCase();
		
		bookcase.addBook(new Book(12345, "Head First Java", "K.Sierra, B.Bates", "O'Reilly", 2015, 720, 48.77, "hard"));
		bookcase.addBook(new Book(67890, "Thinking in Java", "B.Eckel", "Prentice Hall", 2000, 1127, 79.65, "hard"));
		bookcase.addBook(new Book(11223, "Java in a Nutshell", "B.J.Evans, D.Flanagan", "O'Reilly", 2019, 470, 55.10, "soft"));
		bookcase.addBook(new Book(11223, "1984", "G.Orwell", "Secker and Warburg", 1949, 320, 24.70, "soft"));
		bookcase.addBook(new Book(45621, "Harry Potter and the Order of the Phoenix", "J.K.Rowling", "A.A.Levine Books", 2003, 896, 9.99, "hard"));
		bookcase.addBook(new Book(99876, "OCP Java SE 8: Programmer II Exam Guide", "K.Sierra, B.Bates", "Oracle Press", 2018, 976, 39.99, "soft"));
		
		BookView view = new BookView();
		BookLogic logic = new BookLogic();
		
		view.viewBooks(bookcase);
		
		List<Book> booksByAuthor;
		booksByAuthor = logic.getBooksByAuthor(bookcase, "K.Sierra, B.Bates");
		view.viewSortedBooks(booksByAuthor);
		
		List<Book> booksByPublisher;
		booksByPublisher = logic.getBooksByPublisher(bookcase, "O'Reilly");
		view.viewSortedBooks(booksByPublisher);
		
		List<Book> booksByYear;
		booksByYear = logic.getBooksByYear(bookcase, 2001);
		view.viewSortedBooks(booksByYear);
		
	}

}
