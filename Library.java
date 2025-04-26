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
import java.util.Scanner;

public class Library {
	// ArrayLists to house book inventory and cardholder information
   	public ArrayList<Book> books = new ArrayList<>();
   	public ArrayList<Cardholder> cardholders = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);

	// Constructor
	public Library() {
		books = new ArrayList<>();
		cardholders = new ArrayList<>();
	}

	// Menu navigation
	public void displayMainMenu() {
		System.out.println("    Library Menu");
		System.out.println("");
		System.out.println("1 | Search Books");
		System.out.println("2 | Search Cardholders");
		System.out.println("3 | Exit");
	}

	public void searchBookMenu() {
		System.out.println("    Search Books");
		System.out.println("");
		System.out.println("1 | Search by Title");
		System.out.println("2 | Search by Author");
		System.out.println("3 | Back");
	}

	public void searchCardholderMenu() {
		System.out.println("   Search Cardholders");
		System.out.println("");
		System.out.println("1 | Search by name");
		System.out.println("2 | Search by phone number");
		System.out.println("3 | Back");
	}

	// method to display books within an ArrayList
	public void displayBooks(ArrayList<Book> bookList) {
		for (Book b: bookList) {
			System.out.println(b.toString());
		}
	}

	// method to find book by title
	public ArrayList<Book> findByTitle() {
		System.out.println();
		System.out.print("Enter book title: ");
		String title = scan.nextLine();
		ArrayList<Book> temp = new ArrayList<>();
		for (Book b: books) {
			if (b.title.toLowerCase().equals(title.toLowerCase()))
				temp.add(b);
		}
		if (temp[0] = null)
         	System.out.println("No books found by title: " + title);
      	return temp;
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
	public Cardholder findCHbyName() {
		System.out.println();
		System.out.println("Enter name: ");
		String name = scan.nextLine();
		for (Cardholder c: cardholders) {
			if (c.name.toLowerCase().equals(name.toLowerCase()))
				return c;
		}
		System.out.println("This name is not associated with any cardholder.");
		return new Cardholder();
	}

	public Cardholder findCHbyPhoneNumber() {
		System.out.println();
		System.out.println("Enter phone number: ");
		String phoneNumber = scan.nextLine();
		for (Cardholder c: cardholders) {
			if (c.phoneNumber.equals(phoneNumber))
				return c;
		}
		System.out.println("Phone number is not associated with any cardholder.");
		return new Cardholder();
	}
	

	// 'main' method to execute the program
    public static main(String[] args) {
    	boolean run = true;
		while (run) {
			displayMainMenu();
			int choice = scan.nextInt();
			switch (choice) {
				case 1:
					searchBookMenu();
					choice = scan.nextInt();
					switch (choice) {
						case 1:
							displayBooks(findByTitle());
							break;
						case 2: 
							// pending class relationships
							break;
						case 3:
							displayMainMenu();
							break;
						default:
							System.out.println("Please enter a valid input.");
							break;
					}
					break;
				case 2:
					searchCardholderMenu();
					choice = scan.nextInt();
					switch (choice) {
						case 1:
							displayCardholder(findCHbyName());
							break;
						case 2:
							displayCardholder(findCHbyPhoneNumber());
							break;
						case 3:
							displayMainMenu();
							break;
					}
					break;
				case 3:
					run = false;
					break;
				default:
					System.out.println("Please enter a valid input.");
					break;
			}
		}
		
    }
}
