import java.util.Scanner;

public class GrossPay 
{
	String employeeID = "";
	Double grossPay = 0.0;
	
	public GrossPay()
	{
		//Empty Constructor
	}
	
	public void inputEmployee()
	{
		Scanner input = new Scanner(System.in);	
		int employeeType;
		
		System.out.println("The federal tax rate is 10% of gross pay.");
		System.out.println("The state tax rate is 5% of gross pay.\n");
		System.out.print("Enter 1 for hourly and 2 for salaried or -1 to quit: ");
		employeeType = input.nextInt();
		
		while(employeeType < 3 && employeeType > 0 && employeeType != -1)
		{
			switch(employeeType)
			{
				case 1:
					inputHourly();
					break;
				case 2:
					inputSalaried();
					break;
				default:
					break;
			}
			
			System.out.print("Enter 1 for hourly and 2 for salaried or -1 to exit: ");
			employeeType = input.nextInt();
		}
		
		
	}
	public void inputHourly()
	{
		Scanner input = new Scanner(System.in);	
		
		double payRate = 0.0;
		int hours = 0;
		String employeeID = "";
		
		
		
		System.out.print("Enter your hours worked or -1 to exit : ");
		hours = input.nextInt();
		
		while(hours != -1)
		{
		System.out.print("Enter your employee ID (Hourly employee):");
		employeeID = input.next();
		this.employeeID = employeeID;
		
		System.out.print("Enter your pay rate $/hour: ");
		payRate = input.nextDouble();
		
		calculatePay(hours, payRate);
		displayEmployee();
		
		System.out.print("Enter your hours worked or -1 to exit : ");
		hours = input.nextInt();
		}	
	}
	
	public void inputSalaried()
	{
		Scanner input = new Scanner(System.in);
		
		String employeeID = "";
		double yearlySalary = 0.0;
		
		System.out.print("Enter your yearly salary or -1 to exit: ");
		yearlySalary = input.nextDouble();
		
		while (yearlySalary != -1)
		{
			System.out.print("Enter your employee ID: ");
			employeeID = input.next();
			
			calculatePay(yearlySalary);
			displayEmployee();
			
			this.employeeID = employeeID;
			System.out.print("Enter your yearly salary or -1 to exit: ");
			yearlySalary = input.nextDouble();
		}
	}
	
	public void calculatePay(int hours, double payRate)
	{
		double grossPay = 0.0;
					
		if (hours <= 40 && hours >= 0)
			grossPay = (double) hours * payRate;
		else if (hours > 40 && hours <= 50 )
			grossPay = (40 * payRate) + (( (double) hours - 40) * (1.5 * payRate));
		else if (hours > 50)
				// Pay for first 40 hours        Pay for above 50 hours       Pay for between 40 and 50 hours
			grossPay = (40 * payRate) + (( (double) hours - 50) * (2 * payRate)) + (10 *( 1.5 * payRate));
		   	
		this.grossPay = grossPay;
	}
	
	//method to calculate salaried employee weekly gross pay
	public void calculatePay(double annualSalary)
	{
		grossPay = annualSalary / 52;
		
		this.grossPay = grossPay;
	}
	
	public String getEmployeeID()
	{
		return this.employeeID;
	}
	//calculate federal tax
	public double getFederalTax()
	{
		double federalTax = 0;
		final double federalTaxRate = 0.1;
		
		federalTax = this.grossPay * federalTaxRate;
		
		return federalTax;
	}
	
	//calculate state tax
	public double getStateTax()
	{
		double stateTax = 0;
		double stateTaxRate = 0.05;
		
		stateTax = this.grossPay * stateTaxRate;
		
		return stateTax;
	}
	
	//calculate total tax
	public double getTotalTax()
	{
		double totalTax = 0.00;
		
		totalTax = getFederalTax() + getStateTax();
		
		return totalTax;
	}
	
	//calculate net pay after tax
	public double getNetPay()
	{
		double netPay = 0;
		
		netPay = this.grossPay - getTotalTax();
		
		return netPay;
	}
	
		
	public void displayEmployee()
	{
		System.out.printf("Employee: %s%n", getEmployeeID());
		System.out.printf("Gross Pay: %.2f%n", this.grossPay);
		System.out.printf("The federal tax is: %.2f%n", getFederalTax());
		System.out.printf("The state tax is: %.2f%n", getStateTax());
		System.out.printf("The total tax is: %.2f%n", getTotalTax());
		System.out.printf("The net pay is: %.2f%n", getNetPay());
	}
}