public class Date 
{
	private String monthS;
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year

   private static final int[] daysPerMonth = 
      {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   // constructor: confirm proper value for month and day given the year
   public Date(int month, int day, int year)
   {
      this.month = month;
      this.day = day;
      this.year = year;
      
      display();
   } 
   public Date(String month, int day, int year)
   {
      if (month.equals("January") == true)
    	  this.month = 1;
      else if (month.equals("Febuary") == true)
    	  this.month = 2;
      else if (month.equals("March") == true)
    	  this.month = 3;
      else if (month.equals("April") == true)
    	  this.month = 4;
      else if (month.equals("May") == true)
    	  this.month = 5;
      else if (month.equals("June") == true)
    	  this.month = 6;
      else if (month.equals("July") == true)
    	  this.month = 7;
      else if (month.equals("August") == true)
    	  this.month = 8;
      else if (month.equals("September") == true)
    	  this.month = 9;
      else if (month.equals("October") == true)
    	  this.month = 10;
      else if (month.equals("November") == true)
    	  this.month = 11;
      else if (month.equals("December") == true)
    	  this.month = 12;
      else { this.month = 1; }
      
      
      this.day = day;
      this.year = year;
      
      display();
   } 
   public Date(int day, int year)
   {
	   int month = 0;
	   int dayC = day;
	   int dayB = 0;
	   
	   
	   if ( day < 1 || day > 366)
			day = 1;
	   
	   for ( int a = 0; month < 13 && (day - daysPerMonth[a] > 0); a++)
	   {
		    ++month;
		    day -= daysPerMonth[a];
	   }
	   
	   this.month = month;
	   this.day = day;
	   this.year = year;
	   
	   display();
   }
   public void display()
   {
	   int month = this.month;
	   int day = this.day;
	   int year = this.year;
      // check if month in range
      if (month <= 0 || month > 12)
         throw new IllegalArgumentException(
            "month (" + month + ") must be between 1-12");

      // check if day in range for month
      if (day <= 0 || 
         (day > daysPerMonth[month] && !(month == 2 && day == 29)))
         throw new IllegalArgumentException("day (" + day + 
            ") out-of-range for the specified month and year");

      // check for leap year if month is 2 and day is 29
      if (month == 2 && day == 29 && !(year % 400 == 0 || 
           (year % 4 == 0 && year % 100 != 0)))
         throw new IllegalArgumentException("day (" + day +
            ") out-of-range for the specified month and year");

      
      if (month == 1)
    	  this.monthS = "January";
      else if (month == 2)
    	  this.monthS = "Febuary";
      else if (month == 3)
    	  this.monthS = "March";
      else if (month == 4)
    	  this.monthS = "April";
      else if (month == 5)
    	  this.monthS = "May";
      else if (month == 6)
    	  this.monthS = "June";
      else if (month == 7)
    	  this.monthS = "July";
      else if (month == 8)
    	  this.monthS = "August";
      else if (month == 9)
    	  this.monthS = "September";
      else if (month == 10)
    	  this.monthS = "October";
      else if (month == 11)
    	  this.monthS = "November";
      else if (month == 12)
    	  this.monthS = "December";
      
      System.out.printf("%n%d/%d/%d%n", month, day, year);
      System.out.printf("%s %d, %d%n", monthS, day, year);
      System.out.printf("%d %d%n", day, year);
   }  
}