package LibraryOrderingSystem;

//import the scanner from java library
import java.util.Scanner;

//Create an Admin Class 
public class Admin {
	
	//Class data Members:
	static String LibraryName = "UTHM_Management";
	
    // Creating object of Scanner class
	static Scanner inputScanner = new Scanner(System.in);
	
	//Create a setter for LibraryName variable "Mutator"
	public static void setLibraryName()
	{
	    System.out.println("\t\t\t\t+===================================+");
	    System.out.println("\t\t\t\t|Enter Admin name:                  |");
	    System.out.println("\t\t\t\t+===================================+");
        System.out.println("");
        LibraryName= inputScanner.next(); 
	}

	//Create a getter for LibraryName variable to return it's value "Accessor"
	public static String getLibraryName(){

	    return LibraryName;
	}
	
	//Create function for printing Library Name
	public static void displayInfo(){
        System.out.println("\t\t\t\t|Welcome " +getLibraryName() +"!");
    }

}
