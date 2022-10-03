import java.util.Scanner;

public class employeeTest 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employe's first & last name, Street addres, City, State, Zip, Phone number, date of birth, email address, and salary:");
		String inputedContent = input.nextLine();
		
		String[] content = inputedContent.split(", ");
		
		if (content.length != 10)
		{
			System.out.println("RE-Enter employe's first & last name, Street addres, City, State, Zip, Phone number, date of birth, email address, and salary:");
			inputedContent = input.nextLine();
			
			content = inputedContent.split(", ");
			while (content.length != 10)
			{
				System.out.println("RE-Enter employe's first & last name, Street addres, City, State, Zip, Phone number, date of birth, email address, and salary:");
				inputedContent = input.nextLine();
				
				content = inputedContent.split(", ");
			}
		}
		String firstName = content[0];
		String lastName = content[1];
		String address = content[2];
		String city = content[3];
		String state = content[4];
		String zip = content[5];
		String phone = content[6];
		String dateOfBirth = content[7];
		String email = content[8];
		String salary = content[9];
		
		if (!Employee.validateFirstName(firstName)){
	         System.out.println("Invalid first name - Must be less than 20 letters");
	         System.out.print("Enter first name again: ");
	 		 firstName = input.next();
	 		 while(!Employee.validateFirstName(firstName))
	 		 {
	 			System.out.print("Enter first name again: ");
		 		 firstName = input.next();
	 		 }
		}
	    if (!Employee.validateLastName(lastName)){
	    	System.out.println("Invalid last name - Must be less than 30 letters");
	    	System.out.print("Enter last name again: ");
	 		 lastName = input.next();
	 		 while(!Employee.validateLastName(lastName))
	 		 {
	 			System.out.print("Enter last name again: ");
		 		lastName = input.next();
	 		 }
	    }
	    if (!Employee.validateAddress(address)){
	    	System.out.println("Invalid address - (Address) (Street) (Street Type)");
	    	System.out.println("Enter address again: ");
	 		 firstName = input.nextLine();
	 		 while(!Employee.validateAddress(address))
	 		 {
	 			System.out.print("Enter address again: ");
		 		address = input.nextLine();
	 		 }
	    }
	    if (!Employee.validateCity(city)){
	        System.out.println("Invalid city");
	        System.out.print("Enter city again: ");
	 		 city = input.next();
	 		 while(!Employee.validateCity(city))
	 		 {
	 			System.out.print("Enter city again: ");
		 		city = input.next();
	 		 }
	    }
	    if (!Employee.validateState(state)){
	        System.out.println("Invalid state - Try entering 2-Digit State Code");
	        System.out.print("Enter state again: ");
	 		 state = input.next();
	 		 while(!Employee.validateState(state))
	 		 {
	 			System.out.print("Enter State again: ");
		 		 state = input.next();
	 		 }
	    }
	    if (!Employee.validateZip(zip)){
	        System.out.println("Invalid zip code");
	        System.out.print("Enter zip code again: ");
	 		 zip = input.next();
	 		 while(!Employee.validateZip(zip))
	 		 {
	 			System.out.print("Enter zip code again: ");
		 		 zip = input.next();
	 		 }
	    }
	    if (!Employee.validatePhone(phone)){
	        System.out.println("Invalid phone number - 123-456-7890");
	        System.out.print("Enter phone number again: ");
	 		 phone = input.next();
	 		 while(!Employee.validatePhone(phone))
	 		 {
	 			System.out.print("Enter phone number again: ");
		 		 phone = input.next();
	 		 }
	    }
	    if (!Employee.validateBirthDate(dateOfBirth)){
	    	System.out.println("Invalid birth date - 01-01-2001");
	    	System.out.print("Enter birth date again: ");
	 		 dateOfBirth = input.next();
	 		 while(!Employee.validateBirthDate(dateOfBirth))
	 		 {
	 			System.out.print("Enter birth date again: ");
		 		 dateOfBirth = input.next();
	 		 }
	    }
	    if (!Employee.validateEmail(email)){
	    	System.out.println("Invalid email - name@example.com");
	    	System.out.print("Enter email address again: ");
	 		 email = input.next();
	 		 while(!Employee.validateEmail(email))
	 		 {
	 			System.out.print("Enter email address again: ");
		 		 email = input.next();
	 		 }
	    }
	    if (!Employee.validateSalary(salary)){
	    	System.out.println("Invalid salary - Really?  Make it a number.");
	    	System.out.print("Enter salary again: ");
	 		 salary = input.next();
	 		 while(!Employee.validateSalary(salary))
	 		 {
	 			System.out.print("Enter salary again: ");
		 		 salary = input.next();
	 		 }
	    }
		
		System.out.print(firstName + "\n" + lastName + "\n" + address + "\n" + city + " " + state + " " + zip + "\n" + phone + "\n" + dateOfBirth + "\n" + email + "\n" + salary);
   } // end main
} // end class PayrollSystemTest