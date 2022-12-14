import java.io.FileNotFoundException;     
import java.lang.SecurityException;       
import java.util.Formatter;               
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;  
import java.util.Scanner; 


public class employeeTest 
{
	static int employeeCount = 0;
	private static Formatter output; // outputs text to a file       

	   public static void main(String[] args)
	   {
	      openFile();
	      addRecords();
	      closeFile();
	   } 

	   // open file clients.txt
	   public static void openFile()
	   {
	      try
	      {
	         output = new Formatter("payrolldata.txt"); // open the file
	      }
	      catch (SecurityException securityException)
	      {
	         System.err.println("Write permission denied. Terminating.");
	         System.exit(1); // terminate the program
	      } 
	      catch (FileNotFoundException fileNotFoundException)
	      {
	         System.err.println("Error opening file. Terminating.");
	         System.exit(1); // terminate the program
	      } 
	   } 

	   // add records to file
	   public static void addRecords()
	   {
	      Scanner input = new Scanner(System.in);
	      System.out.printf("%s%n? ", "Enter account number, first name, last name, hours worked, and pay rate.");

	      while (employeeCount < 5) // loop until end-of-file indicator
	      {
	    	 
	    	 
	    	 
	         try
	         {
	            // output new record to file; assumes valid input
	            output.format("%d %s %s %.2f %.2f%n", input.nextInt(),
	               input.next(), input.next(), input.nextDouble(), input.nextDouble());                             
	         } 
	         catch (FormatterClosedException formatterClosedException)
	         {
	            System.err.println("Error writing to file. Terminating.");
	            break;
	         } 
	         catch (NoSuchElementException elementException)
	         {
	            System.err.println("Invalid input. Please try again.");
	            input.nextLine(); // discard input so user can try again
	         }
	         ++employeeCount;
	         if (employeeCount < 6) System.out.print("? ");
	      }
	      
	      closeFile();
	      ReadTextFile read = new ReadTextFile();
	      openFile();
	      
	      System.out.printf("%s%n%s%n? ", "Enter account number, first name, last name, hours worked, and pay rate.", "Enter end-of-file indicator to end input.");
	      while (input.hasNext())
	      {
	    	  try
		         {
		            // output new record to file; assumes valid input
		            output.format("%d %s %s %.2f %.2f%n", input.nextInt(),
		               input.next(), input.next(), input.nextDouble(), input.nextDouble());                             
		         } 
		         catch (FormatterClosedException formatterClosedException)
		         {
		            System.err.println("Error writing to file. Terminating.");
		            break;
		         } 
		         catch (NoSuchElementException elementException)
		         {
		            System.err.println("Invalid input. Please try again.");
		            input.nextLine(); // discard input so user can try again
		         }
		         System.out.print("? ");
	      }
	      closeFile();
	      ReadTextFile read2 = new ReadTextFile();
		  openFile();
	   }

	   // close file
	   public static void closeFile()
	   {
	      if (output != null)
	         output.close();
	   }  
} // end class PayrollSystemTest