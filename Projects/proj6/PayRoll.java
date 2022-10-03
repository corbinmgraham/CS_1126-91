import java.util.Scanner;


public class PayRoll 
{
	int employeeCounter = 0;
	double totalPay = 0;
	
	public PayRoll ()
	{
	}
	
	private double calculateGrossPay(double payRate, int hours)
	{
		
		double grossPay = 0.0;
					
		if (hours <= 40 && hours >= 0)
			grossPay = (double) hours * payRate;
		else if (hours > 40 && hours <= 50 )
			grossPay = (40 * payRate) + (( (double) hours - 40) * (1.5 * payRate));
		else if (hours > 50)
				// Pay for first 40 hours        Pay for above 50 hours       Pay for between 40 and 50 hours
			grossPay = (40 * payRate) + (( (double) hours - 50) * (2 * payRate)) + (10 *( 1.5 * payRate));
		
		totalPay += grossPay;
		employeeCounter++;
		   	
		return grossPay;	
	}
			
	private double calculateAveragePay(double payRate, int hours)
	{
		double average = 0;
		
		if (employeeCounter != 0)
		{
			average = totalPay / employeeCounter;
		}
		
		return average;
	}
	
	public void inputContent()
	{
		Scanner input = new Scanner(System.in);	
		
		double payRate = 0;
		int hours = 0;
		
		System.out.print("Enter pay rate $/hour or -1 to quit: ");
		payRate = input.nextDouble();
		
		while(payRate != -1)
		{
			System.out.print("Enter number of hours employee worked:");
			hours = input.nextInt();
		
			System.out.printf("%s%.2f%n", "Employee is paid $", calculateGrossPay(payRate, hours));
			
		
			System.out.print("Enter pay rate $/hour or -1 to quit: ");
			payRate = input.nextDouble();
		}
		
		System.out.printf("%s%.2f", "Average pay is: $", calculateAveragePay(payRate, hours));
	}
	
	
}
	
	


