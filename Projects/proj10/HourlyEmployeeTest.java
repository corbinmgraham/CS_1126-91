public class HourlyEmployeeTest
{
   public static void main(String[] args) 
   {
      // instantiate hourlyEmployee object
      HourlyEmployee employee = new HourlyEmployee("Bob", "Lewis", "333-33-3333", 100.0, 40.0);
      
      // get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s: %.2f%n", "Earnings are", 
         employee.earnings());

      employee.setHours(50); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
         employee.toString());
   } // end main
}