public class Employee extends Object
{
   private String firstName;                              
   private String lastName;                               
   private String socialSecurityNumber;

   // three-argument constructor
   public Employee(String firstName, String lastName, String socialSecurityNumber)
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;
   } // end constructor 

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
      return String.format("%s: %s %s%n%s: %s%n", 
         "Employee", getFirstName(), getLastName(), 
         "Social Security Number", getSocialSecurityNumber());
   } 
} // end class Employee