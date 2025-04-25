/*
 * Project: Library Management System
 * Class: INFO-C 211
 * Author: Brett Swardenski
 * Description: This is the primary class of the program that contains the 'main' method and incorporates all other classes.
 */
import java.util.ArrayList;

public class Library {
	// ArrayLists to house book inventory and cardholder information
   	public ArrayList<Book> books = new ArrayList<>();
   	public ArrayList<Cardholder> cardholders = new ArrayList<>();

	// method to find book by title
	public Book[] findByTitle(String title) {
		ArrayList<Book> temp = new ArrayList<>();
		for (Book b: books) {
			if (b.title = title)
				temp.add(b);
		}
		if (temp[0] = null)
         	System.out.println("No books found by title: " + title);
      	return temp;
	}

	

	// 'main' method to execute the program
    public static main(String[] args) {
    
    }
}
