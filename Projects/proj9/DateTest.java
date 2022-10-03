import java.util.Scanner;

public class DateTest 
{
   public static void main(String[] args)
   {
	  int mon, day, yr;
	  String Month;
	  
      // Date newDate = new Date(7, 24, 1949);
      // Date newDate1 = new Date("July", 24, 1949);
      // Date newDate2 = new Date(24, 1949);
      //Bad Numbers:
      // Date newDate3 = new Date(13, 34, 3015);
      
      Scanner input = new Scanner(System.in);
      
      System.out.print( "Enter 1 for format: MM/DD/YYYY\n" +
              			"Enter 2 for format: Month DD, YYYY\n" +
		         		"Enter 3 for format: DDD YYY\n");
      int select = input.nextInt();
      
      switch(select)
      {
      case 1:
    	  System.out.print("Format: MM/DD/YYYY\n");
    	  System.out.print("Enter: Month");
    	  mon = input.nextInt();
    	  System.out.print("Enter: Day");
    	  day = input.nextInt();
    	  System.out.print("Enter: Year");
    	  yr = input.nextInt();
    	  
    	  Date newDate = new Date(mon, day, yr);
    	  break;
      case 2:
    	  System.out.print("Format: Month DD, YYYY\n");
    	  System.out.print("Enter: Month");
    	  Month = input.next();
    	  System.out.print("Enter: Day");
    	  day = input.nextInt();
    	  System.out.print("Enter: Year");
    	  yr = input.nextInt();
    	  
    	  Date newDate1 = new Date(Month, day, yr);
    	  break;
     case 3:
    	System.out.print("Format: DD YYY\n");
   	  	System.out.print("Enter: Day");
   	  	day = input.nextInt();
   	  	System.out.print("Enter: Year");
   	  	yr = input.nextInt();
   	  
   	  	Date newDate2 = new Date(day, yr);
   	  	break;
     default:
			System.out.println("Incorrect number entered.");
      }
   } 
}