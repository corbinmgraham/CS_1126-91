// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.
import java.io.*;
import java.lang.IllegalStateException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
    private static Scanner input;
    private static Formatter output;
    private static int employeeNumber = 0;
	private static String firstName;
	private static String lastName;
	private static double hours;
	private static double payRate;
	private static double grossPay;

   public ReadTextFile()
   {
      openFile();
      readRecords();
      closeFile();
   } 

   // open file clients.txt
   public static void openFile()
   {
      try
      {
         input = new Scanner(Paths.get("payrolldata.txt")); 
         output = new Formatter("grosspay.txt"); // open the file
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }

   // read record from file
   public static void readRecords()
   {
      System.out.printf("%-10s%-12s%-12s%-12s%-12s%10s%n", "Account",
         "First Name", "Last Name", "Hours", "Pay rate", "Gross Pay");

      try 
      {
         while (input.hasNext()) // while there is more to read
         {
        	employeeNumber = input.nextInt();
			firstName = input.next();
			lastName = input.next();
			hours = input.nextDouble();
			payRate = input.nextDouble();
			grossPay = calculateGrossPay(hours, payRate);
				
			System.out.printf("\n%-12d%-12s%-12s%-12.2f%-12.2f%10.2f%n", employeeNumber, firstName,
				lastName, hours, payRate, grossPay);
			
			try{
				output.format("%d %s %s %.2f%n", employeeNumber,
			               firstName, lastName, grossPay);
				}
				catch (NoSuchElementException elementException){
			    	System.err.println("File improperly formed. Terminating.");
			    }
				catch (IllegalStateException stateException){
					System.err.println("Error reading from file. Terminating.");
				}
         }
      } 
      catch (NoSuchElementException elementException)
      {
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException)
      {
         System.err.println("Error reading from file. Terminating.");
      } 
   } // end method readRecords

   // close file and terminate application
   public static void closeFile()
   {
      if (input != null)
         input.close();
      if (output != null)
    	  output.close();
   }
   
   public static double calculateGrossPay(double hours, double payRate){

		if(hours >= 0 && hours <= 40)
			grossPay = (double) hours * payRate;
		else 
			if (hours > 40 )
				grossPay = 40 * payRate + ((double) hours - 40) * (1.5 * payRate);
				
		return grossPay;	
	}
} // end class ReadTextFile