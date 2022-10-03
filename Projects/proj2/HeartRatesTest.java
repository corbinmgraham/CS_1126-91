import java.util.Scanner; // program uses class Scanner

public class HeartRatesTest
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
	   String fName = "";
	   String lName = "";
	   int day, month, year;
	   
	   
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("Enter first name: ");
	   fName = input.next();
	   System.out.print("Enter last name: ");
	   lName = input.next();
	   System.out.print("Enter year born: ");
	   year = input.nextInt();
	   System.out.print("Enter month born: ");
	   month = input.nextInt();
	   System.out.print("Enter day born: ");
	   day = input.nextInt();
	   
      HeartRates hr = new HeartRates(fName, lName, day, month, year);
      
      
      // System.out.printf("%s%d", "Age: ", hr.calculateAge(day, month, year));
      System.out.printf("%s%s%s%s %s%d %n %s%d%s%d %n", 
    		  "Name: ", hr.getFName(), " ", hr.getLName(), "Age: ", 		  
		  hr.calculateAgeInDays(day, month, year),
    		  "Maximum Heart Rate: ", hr.calculateMaxHeartRate(), 
    		  "Target heart rate is ", hr.calculateTargetHeartRate());
   }
}