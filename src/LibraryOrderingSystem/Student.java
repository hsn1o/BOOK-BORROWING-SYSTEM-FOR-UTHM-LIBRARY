package LibraryOrderingSystem;

//import the scanner from java library
import java.util.Scanner;

//Create an Student Class as subclass and Books as a superclass
public class Student extends Books{


	//Class data Members:
	 	public static String studentBook[] = new String[100];	
	 	public static String name[] = new String[100];	
	 	public static String MatricNo[] = new String [100];
	 	public static int StudentBook[] = new int [100];

	    // Creating object of Scanner class
		   Scanner inputScanner = new Scanner(System.in);
	 	
		   
		//constructor of Student class 
		 public Student() {
			 
				//set name for the Student 
			    System.out.println("\t\t\t\t+===================================+");
			    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
			    System.out.println("\t\t\t\t|Student Name:                      |");
			    System.out.println("\t\t\t\t+===================================+");
					this.name[countStudent] = inputScanner.nextLine();
					
					//set Matric Number for the Student 
				    System.out.println("\t\t\t\t+===================================+");
				    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
				    System.out.println("\t\t\t\t|Matric No  :                       |");
				    System.out.println("\t\t\t\t+===================================+");
					this.MatricNo[countStudent] = inputScanner.nextLine();

					
				}
}
