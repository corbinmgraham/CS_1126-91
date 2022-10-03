import java.util.Scanner; // program uses class Scanner

public class bmi
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);
      
      double weightInPounds = 0, heightInInches = 0, bmi = 0;
      
      System.out.print("Enter weight (lbs)");
      weightInPounds = input.nextDouble();
      
      System.out.print("Enter height (in.)");
      heightInInches = input.nextDouble();
      
      bmi = (weightInPounds * 703) / (heightInInches * heightInInches);
      
      System.out.printf("%s%.1f%n%n", "Your BMI is: ", bmi);
      System.out.print("BMI Values:  \nUnderweight: less than 18.5.  \nNormal: Between 18.5 and 24.9.  \nOverweight: between 25 and 29.9.  \nObese: 30 or greater.");
   }
}