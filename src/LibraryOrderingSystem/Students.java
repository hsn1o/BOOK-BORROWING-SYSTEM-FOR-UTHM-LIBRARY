package LibraryOrderingSystem;

import java.text.SimpleDateFormat;
//Import calendar from Java library
import java.util.Calendar;
//import the scanner from java library
import java.util.Scanner;

//Create a Students Class as subclass and Books as a superclass
public class Students extends Books{
	
	//Class data Members:
	public static int RemoveIndex;
	public static int Choosed;
	public static int QuantityC[] = new int [100];
	public static int SerialNumberC[] = new int [100];
	public static String BookName[] = new String [100];
	public static String authorName[] = new String [100];
	
    // Creating object of Scanner class
    public static Scanner input = new Scanner(System.in);
	//Create object of Book class    
    static Book book[] = new Book[100];
	//Create object of Student class
    public static Student st[] = new Student[100];

    
	 //This function to set the variables of new registered Books
	public static void AddVariables(int i, int p, String name, String authorname) {
		SerialNumberC[i] = p;
		BookName[i] = name;
		authorName[i] = authorname;
	}
	
	
	  //This function is the ShowRegesteredbook Book Name,Author Name, serial number and Quantity	
	public static void ShowRegesteredbook() 
	{
	    System.out.println("\t\t\t\t+===================================+");
        System.out.println("\t\t\t\t|Book Regestered List:              |");
        System.out.println("\t\t\t\t|Book Name\t\tAuthor Name\t\tSerial Number\t\tQuantity|");
		for (int x = 0; x<count; x++) 
		{
		System.out.println("\t\t\t\t|"+(x+1)+". "+BookName[x] + "\t\t" + authorName[x] +"\t\t" + SerialNumberC[x] + "\t\t" + QuantityC[x]);
		}
	    System.out.println("\t\t\t\t+===================================+");
	}
	

	
	  //This function is the to select/add one book from all books for the student 
	public static void AddBookForStudent() 
	{
		ShowStudentBooks();
		Choosed = input.nextInt();
	    System.out.println("\t\t\t\t+===================================+");
	    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
	    System.out.println("\t\t\t\t|Enter quantity:                    |");
	    System.out.println("\t\t\t\t+===================================+");
		QuantityC[count] = input.nextInt();
		if(Choosed> CountA) {
			Choosed-=5;
			AddVariables(count, book[Choosed-1].SerialNumber[Choosed-1], book[Choosed-1].bookName[Choosed-1], book[Choosed-1].AuthorName[Choosed-1]);
			book[Choosed-1].quantity[Choosed-1] -= QuantityC[count];
	  		st[countStudent].StudentBook[countStudent]++;
			 }
	    else {
			AddVariables(count, book[Choosed-1].SerialNoA[Choosed - 1], book[Choosed-1].NameA[Choosed - 1], book[Choosed-1].AuthorNameA[Choosed -1]);
			book[Choosed-1].QuantityA[Choosed-1]-=QuantityC[count];
	  		st[countStudent].StudentBook[countStudent]++;
	    }	
 
    	count++;
    	BorrowingSystem.StudentMenu();	
	}
	
	
	  //This function is to select a books from the registered books list to delete 
	public static void RemoveBookForStudents() {
	    System.out.println("\t\t\t\t+===================================+");
        System.out.println("\t\t\t\t|Choose one to delete:              |");
        System.out.println("\t\t\t\t|Book Name\t\tAuthor Name\t\tSerial Number\t\tQuantity|");
		for (int x = 0; x<count; x++) {

			System.out.println("\t\t\t\t|"+(x+1)+". "+BookName[x] + "\t\t" + authorName[x] +"\t\t" + SerialNumberC[x] + "\t\t" + QuantityC[x]);

		}
		
	    System.out.println("\t\t\t\t+===================================+");
  		st[countStudent].StudentBook[countStudent]--;

	    RemoveIndex = input.nextInt();
	    RemoveIndex -=1;
	    RemoveBookStudent();

	}
	
	
	  //This function is to edit a books quantity from the registered books list 	
	public static void EditQuantity() {
	    System.out.println("\t\t\t\t+===================================+");
        System.out.println("\t\t\t\t|Choose one to Edit:                |");
        System.out.println("\t\t\t\t|Book Name\t\tAuthor Name\t\tSerial Number\t\tQuantity|");
		for (int x = 0; x<count; x++) {

			System.out.println("\t\t\t\t|"+(x+1)+". "+BookName[x] + "\t\t" + authorName[x] +"\t\t" + SerialNumberC[x] + "\t\t" + QuantityC[x]);

		}
	    System.out.println("\t\t\t\t+===================================+");
	    int choose = input.nextInt();
	    System.out.println("\t\t\t\t+===================================+");
	    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
	    System.out.println("\t\t\t\t|Enter new quantity:                |");
	    System.out.println("\t\t\t\t+===================================+");
	    int newQuantity = input.nextInt();

	    QuantityC[choose -1] = newQuantity;
	}
	
	
	
	  //This function is to create a list with all registered books and check in and check out date
	public static void ShowReciept() {
		for(int x = 0; x<count; x++) {
  
		}
			System.out.println("================================================================");
    		System.out.println("checked out to "+ st[countStudent-1].name[countStudent-1]);
    		System.out.println("with Matric Number ("+st[countStudent-1].MatricNo[countStudent-1]+")");
    		System.out.println("================================================================");

            for (int x = 0; x < count; x++) { 
        	System.out.println("================================================================");
    		System.out.println("checked out Book Name "+BookName[x]);
    		System.out.println("with Author Name ("+authorName[x]+")");
    		System.out.println("with Serial No Number ("+SerialNumberC[x]+")");
    		System.out.println("with Quantity number  ("+QuantityC[x]+")");
    		System.out.println("================================================================");

        }
    
		
		 // Instantiate a Date object
		Calendar date = Calendar.getInstance();
            //Date d=new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
		// display time and date using getTime()
		System.out.println("================================================================");
		System.out.println("================================================================");
		System.out.println("Checked out date \n" + sdf.format(date.getTime()));
	      
		// Add 8 months to current date
	      date.add(Calendar.MONTH, 1);
	      System.out.println("Check in date \n" + sdf.format(date.getTime()));
			System.out.println("================================================================");
			System.out.println("================================================================");

	      // display important Notes:
			System.out.println("-------------------------------------------------------------------------+");
			System.out.println("-------------------------------------------------------------------------+");
			System.out.println("important Notes:");
			System.out.println("If you didn't return the book by the due date you will get fined 50RM "
	      					+ "in the first month after expired date and it will duplicate  every month");
			System.out.println("You can extend or update the time refer to our website ");
			System.out.println("-------------------------------------------------------------------------+");
			System.out.println("-------------------------------------------------------------------------+");

        
	    



	}
	
	
	  //This function is to delete all the books from the registered books list 	
	public static void resetBooksList() {
		int x =0;
		for(x=0;  x<count; x++) {
	    if( x < BookName.length -1)
	    {
	    	BookName[count] = BookName[count+1];
	    }
	    
	    if(x < QuantityC.length -1)
	    {
	    	QuantityC[count] = QuantityC[count+1];
	    }	    
	    if(x < SerialNumberC.length -1)
	    {
	    	SerialNumberC[count] = SerialNumberC[count+1];
	    }
	    if(x < authorName.length -1)
	    {
	    	authorName[count] = authorName[count+1];
	    }
	    
		}
		count-=1;
	}
	
	  //This function is to delete a book from the registered books list 	
	public static void RemoveBookStudent() {
		
	    for(int i = RemoveIndex; i < BookName.length -1; i++){
	    	BookName[i] = BookName[i+1];

	      }
	    for(int i = RemoveIndex; i < QuantityC.length -1; i++){
	    	QuantityC[i] = QuantityC[i+1];

	      }	    
	    for(int i = RemoveIndex; i < SerialNumberC.length -1; i++){
	    	SerialNumberC[i] = SerialNumberC[i+1];

	      }
	    for(int i = RemoveIndex; i < authorName.length -1; i++){
	    	authorName[i] = authorName[i+1];

	      }
	    count -=1;
	}
	
}