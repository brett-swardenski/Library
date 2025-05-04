/*
 * Project: Library Management System
 * Class: INFO-C 211
 * Author: Brett Swardenski
 * Description: This is the primary class of the program that contains the 'main' method and incorporates all other classes.
 *
 *
 * 4/25/2025: Being the main class of the program, it depends very heavily on the other classes being fully developed.
 *			  
 */
import java.util.ArrayList;

public class Library {
	// ArrayLists to house book inventory and cardholder information
   	public ArrayList<Book> books = new ArrayList<>();
   	public ArrayList<Cardholder> cardholders = new ArrayList<>();
	public ArrayList<Author> authors = new ArrayList<>();

	// Constructor
	public Library() {
		books = new ArrayList<>();
		cardholders = new ArrayList<>();
		authors = new ArrayList<>();
	}

	// method to display books within an ArrayList
	public void displayBooks(ArrayList<Book> bookList) {
		for (Book b: bookList) {
			System.out.println(b.toString());
		}
	}

	// method to find book by title
	public ArrayList<Book> findByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<>();
		for (Book b: books) {
			int comparison = title.compareTo(b.title);
			if (comparison == 0)
				temp.add(b);
		}
		if (temp[0] = null)
         	System.out.println("No books found by title: " + title);
      	return temp;
	}

	public ArrayList<Book> findByAuthor(Author author) {
		return author.books;
	}

	// method to add a book to the 'books' arraylist and checks if the author is
	// in the 'authors' arraylist. If not, it adds the author to it.
	public void addBook(Book book) {
		books.add(book);
		Author authorCheck = book.author;
		if (findAuthor(authorCheck) == null)
			addAuthor(authorCheck);
	}

	// method to display cardholder information
	public void displayCardholder(Cardholder c) {
		System.out.println(c.toString());
	}

	// method to display all cardholder information
	public void displayAllCardholders() {
		for (Cardholder c: cardholders) {
			displayCardholder(c);
		}
	}

	// methods to search for particular cardholder
	public Cardholder findCHbyName(String name) {
		for (Cardholder c: cardholders) {
			int comparison = name.compareTo(c.name);
			if (comparison == 0)
				return c;
		}
		return null;
	}

	public Cardholder findCHbyPhoneNumber(String phoneNumber) {
		for (Cardholder c: cardholders) {
			int comparison = phoneNumber.compareTo(c.phoneNumber);
			if (comparison == 0)
				return c;
		}
		return null;
	}

	public Author findAuthor(Author author) {
		for (Author a: authors) {
			int comparison = author.compareTo(a);
			if (comparison == 0) 
				return a;
		}
		return null;
	}

	public void addAuthor(Author author) {
		authors.add(author);
	}
}
