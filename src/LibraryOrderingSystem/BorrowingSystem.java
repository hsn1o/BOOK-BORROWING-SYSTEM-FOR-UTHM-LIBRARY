package LibraryOrderingSystem;

import java.util.Scanner;

	
	public class BorrowingSystem extends Admin{
		
		//Create object of Books class
		static	Books books = new Books();
		
		//Create object of Students class
		static Students students = new Students();
		
	    // Creating object of Scanner class
	    public static Scanner input = new Scanner(System.in);
	    	    		
	    
		//This function is the Login Page of the Program... Where it will appear first when program executed
	    public static void Login() {	
		    System.out.println("\t\t\t\t+===================================+");
		    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
		    System.out.println("\t\t\t\t|             Welcome!	            |");
		    System.out.println("\t\t\t\t|       1. Log in as Admin          |");
		    System.out.println("\t\t\t\t|       2. Log in as Student        |");
		    System.out.println("\t\t\t\t|       3. Exit                     |");
		    System.out.println("\t\t\t\t+===================================+");
		    
	    	//Scan/Take input of chooseLogin
		    int chooseLogin = input.nextInt();
		    
	    	// Switch/Case for login page options
	        switch (chooseLogin) {
			case 1:
			{
				//Calling the function that is responsible for switching to Library Management Menu Options				
		    	AdminMenuOptions();  
			    break;
			    
			}
			case 2: 
				
			{
				//Create object of Books class
				Student student = new Student();
				//Calling the function that is responsible for adding new Student User account from Student class
				books.addStudent(student); 
				//Calling function to appear the Student options menu
				StudentMenu(); 
				break;
			}

			case 3:
			{
				//Close the program
				 System.exit(0);
			}
			default:
				 System.out.println("ENTER BETWEEN 1 TO 3.");
				 
				//Repeat the same function by calling itself again				 
				 Login();
			}
		}
	  
	    
	    
	  //This function views the library Management Menu page
	    public static void AdminMenuOptions() {	 
	    	
	    	//Calling function from the "Admin Class" to view Stall Name
	    	displayInfo();
	    	
		    System.out.println("\t\t\t\t+============================================+");
		    System.out.println("\t\t\t\t|         1. Add new Book                    |");
		    System.out.println("\t\t\t\t|         2. Remove a Book                   |");
		    System.out.println("\t\t\t\t|         3. Show All Books                  |");
		    System.out.println("\t\t\t\t|         4. Show All Registered Student     |");
		    System.out.println("\t\t\t\t|         5. Edit Quantity                   |");
		    System.out.println("\t\t\t\t|         6. Change Admin Name               |");
		    System.out.println("\t\t\t\t|         7. Log Out                         |");
		    System.out.println("\t\t\t\t+============================================+");
		    
		    //Scan/Take input of the SelectMenu
		    int SelectMenu = input.nextInt();

	    	// Switch/Case for  Check if Customer is student or not page options
		    switch (SelectMenu) {
		    
		    //Case 1 Add New Meal
			case 1: 
			{
				//Create object of Book class
				Book m = new Book(); 
				
				//Calling the function that is responsible for adding new Books that accessed by Library Management only
			    //use the Book object as a variable for AddMealforResturants(>here<)
				books.addBooksForLibrary(m);
				
				System.out.println("added Successfully");
				
				//Repeat the same function by calling itself again
				AdminMenuOptions();
			    
			}
			//Case 2 Remove a Book
			case 2:
			{
				//Calling the function that is responsible for Removing the book from books class
				books.RemoveBook();
				
				System.out.println("Removed Successfully");
				
				//Repeat the same function by calling itself again
				AdminMenuOptions();

			}
			//Case 3 Show All Books
			case 3:
			{
				//Calling the function that is responsible for only Showing the available books with it's details from books class
				books.ShowBooks();
				
				//Repeat the same function by calling itself again
				AdminMenuOptions();

			}
			//Case 4 Show All registered Students That already registered a book
			case 4:
			{
				
				//Calling the function that is responsible for showing the Students that registered a books from books class				
				books.ShowRegisteredStudents();
				//System.out.println("Edited Successfully");
				AdminMenuOptions();

			}
			//Case 5 Edit new Quantity
			case 5:
			{
				//Calling the function that is responsible for editing the quantity of the books from books class
				books.EditQuantity();
				
				System.out.println("Edited Successfully");
				
				//Repeat the same function by calling itself again				
				AdminMenuOptions();
			}
			
			//Case 6 Change Stall Name
			case 6:
			{
				//Calling the function that is responsible for Changing Library Name from the superclass Admin
				setLibraryName();
				
				//Repeat the same function by calling itself again				
				AdminMenuOptions();
			}
			//Case 7 Logout and login again
			case 7:
			{
				//Calling the function that is responsible for returning back to the Login Page		
				Login();
			}
			
			//	* Default case that will execute for sure 
			//	* if above cases does not match		
			default:
				 System.out.println("ENTER BETWEEN 1 TO 6.");
				//Repeat the same function by calling itself again
				AdminMenuOptions();
			}
		}
	    

	    
	    // function that is responsible for the options menu for the Student
	    public static void StudentMenu(){	
	    System.out.println("\t\t\t\t+===================================+");
	    System.out.println("\t\t\t\t|         1. Show All Book          |");
	    System.out.println("\t\t\t\t|         2. Search a Book          |");	    
	    System.out.println("\t\t\t\t|         3. Check out Book         |");
	    System.out.println("\t\t\t\t|         4. Check in Book          |");
	    System.out.println("\t\t\t\t|         5. Show regestered book   |");
	    System.out.println("\t\t\t\t|         6. Proceed                |");
	    System.out.println("\t\t\t\t|         7. Log Out                |");
	    System.out.println("\t\t\t\t+===================================+");
	    
	    //Scan/Take input of the SelectMenu
        int SelectMenu = input.nextInt();
        
    	// Switch/Case for  Customer Menu Option 
	    switch (SelectMenu) {
	    
	    //Case 1 Show All books
		case 1: 
		{
			// function that is responsible for Showing all Books inside library
			books.ShowBooks();
			
			//Repeat the same function by calling itself again			
	    	StudentMenu();
			break;
		}
		
		//Case 2 Search for book by Serial Number
		case 2:
		{
			//Calling Function that search for a book by serial number from books class
			books.sbySnumber();
			
			//Repeat the same function by calling itself again			
			StudentMenu();
			break;
		}
		
	    //Case 3 Add New Meal
		case 3: 
		{
			//Calling the function that is responsible for Selecting/Adding Book for the Student from Students Class
			students.AddBookForStudent();
			
			//Repeat the same function by calling itself again			
	    	StudentMenu();
			break;
		}
		// Case 4 Remove a Book
		case 4:
		{
			//calling the function that is responsible for the Removing BOOK from students class
			students.RemoveBookForStudents();
			
			//Repeat the same function by calling itself again			
			StudentMenu();
			break;
		}
		//Case 5 Show Registered books
		case 5:
		{
			//Calling function that responsible for show registered books list from students class
			students.ShowRegesteredbook();
			
			//Repeat the same function by calling itself again			
			StudentMenu();
			break;
		}
		//Case 6 Show receipt
		case 6:
		{
			//Calling function that responsible for showing the receipt for student from students class
			students.ShowReciept();
			
			//Repeat the same function by calling itself again			
			StudentMenu();
			break;
		}
		//Case 7 Logout and login again
		case 7:
		{
			//Calling function that responsible for delete all the Registered books list from students class
			students.resetBooksList();
			
			//Calling the function that is responsible for returning back to the Login Page		
			Login();
			break;
		}	
		
		//	* Default case that will execute for sure 
		//	* if above cases does not match	
		default:
			System.out.println("Enter Between 1 TO 7");
			StudentMenu();
		}
	    }
	    

	    
	    public static void main (String[] args) {
			//Create object of Book class
	    	Book book = new Book();
	    	
		    //calling the function that is responsible for creating the arrays of already existed books 	    	
	    	books.AlreadyAddedBooks(book);
	    	
			//Calling the function that is responsible for the Login Page		    
	    	Login();
	     } 
	    
	}
	
	

