package LibraryOrderingSystem;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Books {
	
	//Class data Members:
		public static String Matric;	
		public static int count = 0, countStudent=0;
		public static int CountA = 5;					
		public static boolean DE = true;

		
		//Create object of Student class
		public static Student student[] = new Student[100];

		//Create object of Book class
		static Book[] book = new Book[100];

	    // Creating object of Scanner class
		static Scanner inputScanner = new Scanner(System.in);


		//This function to list the alreadyAddedBooks menu
		public void AlreadyAddedBooks(Book r) {

			// looping to get  the data for the Book 
	        for (int i = 0; i<CountA+1; i++) {
	            book[i]= r;
	        }
	        
			// set all  the data to the already Meals 
	        int i = 0;
	        book[i].QuantityA[i] = 40;
	        book[i].SerialNoA[i] = 10;
	        book[i].NameA[i] = "Book 1";
	        book[i].AuthorNameA[i] = "Salah";


	        i = 1;
	        book[i].QuantityA[i] = 50;
	        book[i].SerialNoA[i] = 23;
	        book[i].NameA[i] = "Book 2";
	        book[i].AuthorNameA[i] = "hasan";

	        i=2;
	        book[i].QuantityA[i] = 90;
	        book[i].SerialNoA[i] = 34;
	        book[i].NameA[i] = "Book 3";
	        book[i].AuthorNameA[i] = "Ali";

	        i=3;
	        book[i].QuantityA[i] = 456;
	        book[i].SerialNoA[i] = 134;
	        book[i].NameA[i] = "Book 4";
	        book[i].AuthorNameA[i] = "Qadasi";

	        i=4;
	        book[i].QuantityA[i] = 46;
	        book[i].SerialNoA[i] = 57;
	        book[i].NameA[i] = "Book 5";
	        book[i].AuthorNameA[i] = "Nasr";

	        //This boolean assigned as false to go directly to the Book class contractor...
	        DE = false;

		}
		
		
		
		//This function to show all Books to the Student which already added and what the library add after 
		public static void ShowStudentBooks() {
		    System.out.println("\t\t\t\t+===================================+");
	        System.out.println("\t\t\t\t|Book Name\t\tAuthor Name\t\tSerial Number\t\tQuantity|");
	        
			//This looping to show all Books to the students which already added  
			for(int i = 0; i<CountA; i++) {
				System.out.println("\t\t\t\t|"+(i+1)+". "+book[i].NameA[i] +"\t\t"+book[i].AuthorNameA[i] + "\t\t\t" + book[i].SerialNoA[i] +"\t\t"+ book[i].QuantityA[i]);

			}
			
			//This looping  to show all Books to the Students which the library will add later 
			for(int i = 0; i<count; i++) {
				System.out.println("\t\t\t\t|"+(i+1+CountA)+". "+book[i].bookName[i] +"\t\t" + book[i].AuthorName[i]+ "\t\t\t" + book[i].SerialNumber[i]+"\t\t"+book[i].quantity[i]);
			}
		    System.out.println("\t\t\t\t+===================================+");

		}
		
		
		
		
		
		
		
		
		
		
		//This function to show all Books to the Library which already added and what the Library add after 		
		public static void ShowBooks() {
		    System.out.println("\t\t\t\t+===================================+");
	        System.out.println("\t\t\t\t|Book Name\t\tAuthor Name\t\tSerial Number\t\tQuantity     |");
	        
			//This looping to show all Books to the Library which already added  
			for(int i = 0; i<CountA; i++) 
			{
				System.out.println("\t\t\t\t|"+(i+1)+". "+book[i].NameA[i] + "\t\t" + book[i].AuthorNameA[i] +"\t\t\t" + book[i].SerialNoA[i] + "\t\t" + book[i].QuantityA[i]);

			}
			
			//This looping to show all Books to the Library which will be added by it later  
			for(int i = 0; i<count; i++) 
			{
				System.out.println("\t\t\t\t|"+(i+1+CountA)+". "+book[i].bookName[i] + "\t\t\t" +book[i].AuthorName[i]+"\t\t\t"+ book[i].SerialNumber[i] + "\t\t" + book[i].quantity[i]);
			}
		    System.out.println("\t\t\t\t+===================================+");

		}
		
		
		
		
		
		
		//This function to compare the Book if there is the same name or not 
		//so this function reject any Book it has already the same name before		
		public int compareBooks(Book r1, Book r2)
	    {
	        for (int i = 0; i < count; i++) {
	        // If book name matches
	        if (r1.bookName[count].equalsIgnoreCase(r2.bookName[i])) {
	 
	            // Printing book exists
	            System.out.println("Book of this Name Already Exists.");
	            return 0;
	        }
	        if (r1.SerialNumber[count] == (r2.SerialNumber[i])) {
	       	 
	            // Printing book exists
	            System.out.println("book of this serial No Already Exists.");
	            return 0;
	        }
	        }
	        return 1;
	    }
		
		

		//This function to compare the Matric if there is the same number or not 
		//so this function reject any Matric number it has already the same number before		
		public int CompareMatric(Student r2)
	    {
			for(int i = 0; i<countStudent; i++)
	        // If Student Matric number matches
	        if (Matric.equalsIgnoreCase(r2.MatricNo[i])) {
	 
	            // Printing book exists
	            System.out.println("Matric No of student Already Exists.");
	            return 0;
	        }
	        return 1;
	    }
		


		
		
		
		
		
		//This function to add Books for Library 	
		public void addBooksForLibrary(Book r)
	    {
	 
	        for (int i = 0; i < count; i++) {
	 
	            if (this.compareBooks(r, this.book[i])== 0)
	                return;
	        }
	        
	        
	 
	        if (count < 100) {
	        	book[count] = r;
	            count++;
	        }
	        else {
	 
	            System.out.println("you reached maximum Books imputs");
	        }
	        
	    }


				
		
		//This function to remove Books from the Library by setting the quantity by zero
		public static void RemoveBook() {
		    System.out.println("\t\t\t\t+===================================+");
	        System.out.println("\t\t\t\t|Choose one to delete:              |");
	        System.out.println("\t\t\t\t|Book Name\t\tSerial Number\t\tQuantity     |");
	        
			for(int i = 0; i<CountA; i++) {
				System.out.println("\t\t\t\t|"+(i+1)+". "+book[i].NameA[i] + "\t\t" + book[i].SerialNoA[i] + "\t\t" + book[i].QuantityA[i]);

			}
			for(int i = 0; i<count; i++) {
				System.out.println("\t\t\t\t|"+(i+1+CountA)+". "+book[i].bookName[i] + "\t\t\t" + book[i].SerialNumber[i] + "\t\t" + book[i].quantity[i]);
			}
		    System.out.println("\t\t\t\t+===================================+");
		    int x = inputScanner.nextInt();
		    if(x > CountA) {
		    	book[x-1].quantity[x-1] = 0;
		    }
		    else {
		    	book[x-1].QuantityA[x-1] = 0;
			}
		}
		
		
		
		//This function to add Student Account 		
		public void addStudent(Student s)
	    {
	 
	        if (countStudent <= 50) {
	            student[countStudent] = s;
	            countStudent++;
	            
	        } 
	    }
		

		
		//This function to Show list of registered student data with the number of selected books and check out/check in date 
		public static void ShowRegisteredStudents() {
			
			//Create object of Books class	
			Students customer = new Students();
			
			for(int i = 0; i<countStudent; i++) {
			System.out.println("\t\t\t\t|"+(i+1)+". Matric No: "+student[i].MatricNo[i] + "\t\t\t Name: " + student[i].name[i]);
    		System.out.println("No. of Books "+"("+student[i+1].StudentBook[i+1]+")");
      		 // Instantiate a Date object
       		Calendar date = Calendar.getInstance();
            //Date d=new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  
       		// display time and date using getTime()
       		System.out.println("================================================================");
       		System.out.println("Checked out date \n" + sdf.format(date.getTime()));
       	      
       		// Add 8 months to current date
       	    date.add(Calendar.MONTH, 1);
       	    System.out.println("Check in date \n" + sdf.format(date.getTime()));
       		System.out.println("================================================================");

        }
		
			
			


		}
		
		
		
		
		
		
		
		
		//This function to editQuantity for Books  
		public static void EditQuantity() {
		    System.out.println("\t\t\t\t+===================================+");
	        System.out.println("\t\t\t\t|Choose one to edit  :              |");
	        System.out.println("\t\t\t\t|Book Name\t\tAuthor Name\t\tSerial Number\t\tQuantity     |");

			for(int i = 0; i<CountA; i++) {
				System.out.println("\t\t\t\t|"+(i+1)+". "+book[i].NameA[i] + "\t\t" + book[i].AuthorNameA[i] +"\t\t" + book[i].SerialNoA[i] + "\t\t" + book[i].QuantityA[i]);
			}
			for(int i = 0; i<count; i++) {
				System.out.println("\t\t\t\t|"+(i+1+CountA)+". "+book[i].bookName[i] + "\t\t\t" +book[i].AuthorName[i]+"\t\t"+ book[i].SerialNumber[i] + "\t\t" + book[i].quantity[i]);
			}
		    System.out.println("\t\t\t\t+===================================+");
		    int x = inputScanner.nextInt();
		    
		    
		    System.out.println("\t\t\t\t+===================================+");
		    System.out.println("\t\t\t\t|     Tunku Tun Aminah Library      |");
		    System.out.println("\t\t\t\t|Set Quantity:                      |");
		    System.out.println("\t\t\t\t+===================================+");
		    int newQuantity = inputScanner.nextInt();
		    if(x > CountA) {
		    	x-=5;
		    	book[x-1].quantity[x-1] = newQuantity;
		    }
		    else {
		    	book[x-1].QuantityA[x-1] = newQuantity;
			}
		}
		
		
		
		//Function to search for a book by serial number
		public void sbySnumber() {
	 
	        // Display message
	        System.out.println("\t\t\t\tSEARCH BY SERIAL NUMBER\n");
	 
	        // Class data members
	        int sNo;
	        System.out.println("Enter Serial No of Book:");
	        sNo = inputScanner.nextInt();
	 
	        int flag = 0;
	        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
	 
	        for (int i = 0; i < count; i++) {
	            if (sNo == book[i].SerialNumber[i]) {
	                System.out.println(book[i].SerialNumber[i] + "\t\t" + book[i].bookName[i] + "\t\t" + book[i].AuthorName[i] + "\t\t" + book[i].quantity[i]);
	                flag++;
	                return;
	            }    
	        } 
	        for (int i = 0; i < CountA; i++) {
	            if (sNo == book[i].SerialNoA[i]) {
	                System.out.println(book[i].SerialNoA[i] + "\t\t" + book[i].NameA[i] + "\t\t" + book[i].AuthorNameA[i] + "\t\t" + book[i].QuantityA[i]);
	                flag++;
	                return;
	            } 
	            
	        }
	        if (flag == 0) {
	            System.out.println("No Book for Serial No "+ sNo);
	        }
	    }
		
		
		
	}
