import java.util.Scanner;

public class Address extends Employee
{
   private final String street;
   private final String city;
   private final String stateCode;
   private final String zip;

   // constructor
   public Employee(String street, String city, String stateCode, int zip)
   {
	   Scanner input = new Scanner(System.in);
	   
	   if (street.length() <= 0)
	   {
	         System.out.println("No enterance found.");
	         System.out.print("Enter street again: ");
	 		 street = input.next();
	 		 while(street.length() <= 0)
	 		 {
	 			System.out.print("Enter street again: ");
		 		street = input.next();
	 		 }
	   }
	   if (city.length() <= 0)
	   {
	         System.out.println("No enterance found.");
	         System.out.print("Enter street again: ");
	 		 city = input.next();
	 		 while(city.length() <= 0)
	 		 {
	 			System.out.print("Enter street again: ");
		 		city = input.next();
	 		 }
	   }
	   if (stateCode.length() <= 0 || statCode.length() > 2)
	   {// validate wage
	         System.out.println("2 letter state code must be within 0-2 letters.");
	         System.out.print("Enter state code again: ");
	 		 stateCode = input.next();
	 		 while(stateCode.length() <= 0 || stateCode.length() > 30)
	 		 {
	 			System.out.print("Enter state code again: ");
		 		stateCode = input.next();
	 		 }
	 		 
	   }
	   if (zip.length() != 5)
	   {// validate wage
	         System.out.println("Zip Code must be 5 digits long.");
	         System.out.print("Enter employee's zip code again: ");
	         socialSecurityNumber = input.next();
	 		 while(socialSecurityNumber.length() != 12)
	 		 {
	 			System.out.print("Enter employee's zip code again: ");
	 			socialSecurityNumber = input.next();
	 		 }
	 		 
	   }
	   
      this.zip = zip;                                    
      this.stateCode = stateCode;                                    
      this.city = city;
      this.street = street;
   } 

   // return first name
   public String getFirstName()
   {
      return firstName;
   } 

   // return last name
   public String getLastName()
   {
      return lastName;
   } 

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber());
   }
} // end abstract class Employee