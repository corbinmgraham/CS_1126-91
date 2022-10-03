import java.util.Scanner;

public class Employee extends Object
{
   // constructor
   public Employee()
   {        
   } 

   public static boolean validateFirstName(String firstName)
   {
	   if (firstName.length() > 20) return false;
	   else if (firstName.matches("[A-Z][a-zA-Z]*") == true) return true;
	   else { return false; }
   } 

   // validate last name
   public static boolean validateLastName(String lastName)
   {
	   if (lastName.length() > 30) return false;
	   else if (lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*") == true) return true;
	   else { return false; }
   } 

   // validate city
   public static boolean validateCity(String city)
   {
      return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
   } 

   // validate address
   public static boolean validateAddress(String address)
   {
      return address.matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
   }
   // validate state
   public static boolean validateState(String state)
   {
      return state.matches("[a-zA-Z]{2}") ;
   }

   // validate zip
   public static boolean validateZip(String zip)
   {
      return zip.matches("\\d{5}");
   }

   // validate phone
   public static boolean validatePhone(String phone)
   {
      return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
   }
   
   // validate birthDate
   public static boolean validateBirthDate(String dateOfBirth)
   {
	   return dateOfBirth.matches("^(0[1-9]|1[012])[-/]?(0[1-9]|[12][0-9]|3[01])[-/]?(19|20)\\d{2}");
   }
   public static boolean validateEmail(String email)
   {
	   return email.matches("^[\\w\\.-]+@([\\w\\-]+\\.)+[a-zA-Z]{2,4}");
   }
   public static boolean validateSalary(String salary)
   {
	   return salary.matches("^\\d{1,6}(?:\\.\\d{0,2})?");
   }

} // end abstract class Employee