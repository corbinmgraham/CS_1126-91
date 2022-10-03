public class HourlyEmployee extends Employee
{
   private double hours; // hours worked in a week
   private double wage; // $ per week

   // five-argument constructor
   public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours)
   {
      super(firstName, lastName, socialSecurityNumber);                      

      setWage(wage);
      setHours(hours);
   }
   
   // set base salary
   public void setWage(double wage)
   {
	// if wage is invalid throw exception
	   if (wage < 0.0)                   
	         throw new IllegalArgumentException(
	            "Salary must be >= 0.0");   

      this.wage = wage;                
   } 
   public void setHours(double hours)
   {
	// if hours are invalid throw exception
	   if (hours < 0.0 || hours > 168)                   
	          throw new IllegalArgumentException(
	             "Hours worked must be >= 0.0");    

      this.hours = hours;                
   } 

   // return base salary
   public double getWage()
   {
      return wage;
   } 
   public double getHours()
   {
      return hours;
   }

   // calculate earnings
   public double earnings()
   {
	   double total = 0.0;
	   
	   if (getHours() <= 40) 
		   total = getWage() * getHours();
	   if (getHours() > 40) 
		   total = (1.5 * (getWage() * getHours()));
	   return total;
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format("%s%n%s: %.2f", super.toString(), "Employee Pay", earnings());   
   } 
} // end class BasePlusCommissionEmployee