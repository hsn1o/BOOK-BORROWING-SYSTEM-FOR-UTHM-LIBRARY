package LibraryOrderingSystem;

//import the scanner from java library
import java.util.Scanner;

//Create an Book Class as subclass and Books as a superclass
public class Book extends Books{
	
	//Class data Members:
	public static String bookName[] = new String [100];
	public static int SerialNumber[] = new int [100];
	public static int quantity[] = new int [100];
	public static String AuthorName[] = new String [100];

	
	public static int SerialNoA[] = new int [100];
	public static int QuantityA[] = new int [100];
	public static String NameA[] = new String[100];
	public static String AuthorNameA[] = new String[100];

    // Creating object of Scanner class
	static Scanner inputScanner = new Scanner(System.in);

	
	//constructor of Book class 
	public Book() {
		//set s condition for the constructor
		if(DE == false) {
		inputScanner.nextLine();
		
		//set name for the Book 
	    System.out.println("\t\t\t\t+===================================+");
	    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
	    System.out.println("\t\t\t\t|Book Name:                         |");
	    System.out.println("\t\t\t\t+===================================+");
			this.bookName[count] = inputScanner.nextLine();
			
			//set Author name for the Book 
		    System.out.println("\t\t\t\t+===================================+");
		    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
		    System.out.println("\t\t\t\t|Book Author:                       |");
		    System.out.println("\t\t\t\t+===================================+");
			this.AuthorName[count] = inputScanner.nextLine();	
			
			//set serial Number for the Book 
		    System.out.println("\t\t\t\t+===================================+");
		    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
		    System.out.println("\t\t\t\t|Book Serial Number:                |");
		    System.out.println("\t\t\t\t+===================================+");
			this.SerialNumber[count] = inputScanner.nextInt();
			
			//set Quantity for the Book 
		    System.out.println("\t\t\t\t+===================================+");
		    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
		    System.out.println("\t\t\t\t|Book Quantity:                     |");
		    System.out.println("\t\t\t\t+===================================+");
			this.quantity[count] = inputScanner.nextInt();
		}
	}

}

