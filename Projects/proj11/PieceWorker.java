public class PieceWorker extends Employee 
{
   private double wage;
   private int pieces;

   // constructor
   public PieceWorker(String firstName, String lastName, 
      String socialSecurityNumber, double wage, int pieces)
   {
      super(firstName, lastName, socialSecurityNumber); 

      if (pieces < 0)
         throw new IllegalArgumentException(
            "Pieces made must be > 0");
      if (wage < 0.0)
    	  throw new IllegalArgumentException(
    			  "Wage must be > 0.0");

      this.wage = wage;
      this.pieces = pieces;
   } 
   // return salary
   public double getWage()
   {
      return wage;
   } 
   public int getPieces()
   {
	   return pieces;
   }
   // calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings()                                            
   {                                                                   
      return wage * pieces;                                        
   }                                             

   // return String representation of SalariedEmployee object   
   @Override                                                    
   public String toString()                                     
   {                                                            
      return String.format("salaried employee: %s%n%s: %d; %s: $%.2f",
         super.toString(), "Pieces Made", getPieces(), "Wage", getWage());
   } 
}