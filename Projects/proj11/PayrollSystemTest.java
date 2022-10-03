import java.util.Scanner;

public class PayrollSystemTest 
{
	public static void main(String[] args) 
	{
		//
		//	Add:
		// - Input
		// - Reference to employee objects using an array
		//
		// Declare scanner object
		Scanner input = new Scanner(System.in);
	   
		//INPUT
		System.out.print("Enter -1 to exit or any other number to continue: ");
		int employeeType = input.nextInt();
		while (employeeType != -1)
		{
			System.out.print("Enter month employee was born: ");
			int month1 = input.nextInt();
			System.out.print("Enter current month: ");
			int month2 = input.nextInt();
			DateB birthMonth = new DateB(month1);
			DateB currentMonth = new DateB(month2);
			
			// Salaried Employee
			System.out.print("Enter Salaried employee's first name: ");
			String fName = input.next();
			System.out.print("Enter Salaried employee's last name: ");
			String lName = input.next();
			System.out.print("Enter Salaried employee's Social Security Number: ");
			String ssn = input.next();
	   		System.out.print("Enter Salaried employee's weekly salary: ");
	   		double aP = input.nextDouble();
	   		SalariedEmployee salariedEmployee = new SalariedEmployee(fName, lName, ssn, aP);
	   		// Hourly Employee
	   		System.out.print("Enter Hourly employee's first name: ");
			fName = input.next();
			System.out.print("Enter employee's last name: ");
			lName = input.next();
			System.out.println("Enter employee's Social Security Number: ");
			ssn = input.next();
			System.out.print("Enter Hourly employee's wage: ");
			double wage = input.nextDouble();
			System.out.print("Enter Hourly employee's hours worked: ");
			int hours = input.nextInt();
			HourlyEmployee hourlyEmployee = new HourlyEmployee(fName, lName, ssn, wage, hours);		
			//Commission Employee
			System.out.print("Enter Commission employee's first name: ");
			fName = input.next();
			System.out.print("Enter Commission employee's last name: ");
			lName = input.next();
			System.out.print("Enter Commission employee's Social Security Number: ");
			ssn = input.next();
			System.out.print("Enter Commission employee's gross sales: ");
			double grossSales = input.nextDouble();
			System.out.print("Enter Commission employee's commission rate: ");
			double commissionRate = input.nextDouble();
			CommissionEmployee commissionEmployee = new CommissionEmployee(fName, lName, ssn, grossSales, commissionRate);	
			//Base Plus Commission Employee
			System.out.print("Enter BP Commission employee's first name: ");
			fName = input.next();
			System.out.print("Enter BP Commission employee's last name: ");
			lName = input.next();
			System.out.print("Enter BP Commission employee's Social Security Number: ");
			ssn = input.next();
			System.out.print("Enter BP Commission employee's gross sales: ");
			grossSales = input.nextDouble();
			System.out.print("Enter BP Commission employee's commision rate: ");
			commissionRate = input.nextDouble();
			System.out.print("Enter BP Commission employee's base salary: ");
			double baseSalary = input.nextDouble();
			BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(fName, lName, ssn, grossSales, commissionRate, baseSalary);
			// Piece Worker
						System.out.print("Enter Piece Worker's first name: ");
						fName = input.next();
						System.out.print("Enter Piece Worker's last name: ");
						lName = input.next();
						System.out.print("Enter Piece Worker's Social Security Number: ");
						ssn = input.next();
				   		System.out.print("Enter Piece Worker's weekly salary: ");
				   		wage = input.nextDouble();
				   		System.out.print("Enter Piece Worker's pieces made: ");
				   		int pieces = input.nextInt();
				   		PieceWorker pieceWorker = new PieceWorker(fName, lName, ssn, wage, pieces);
	
	// create four-element Employee array
      Employee[] employees = new Employee[5]; 

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee; 
      employees[3] = basePlusCommissionEmployee;
      employees[4] = pieceWorker;

      System.out.printf("Employees processed polymorphically:%n%n");
      
      // generically process each element in array employees
      for (Employee currentEmployee : employees) 
      {
         System.out.println(currentEmployee); // invokes toString
         if (birthMonth.getMonth() != currentMonth.getMonth())
         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
         else if (birthMonth.getMonth() == currentMonth.getMonth())
        	 System.out.printf(
        	"earned $%,.2f%n%n", (currentEmployee.earnings() + 100));
      } 
      
      System.out.print("Enter -1 to exit or any other number to continue: ");
	  employeeType = input.nextInt();
		} // End while
   } // end main
} // end class PayrollSystemTest