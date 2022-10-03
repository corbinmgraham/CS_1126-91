import java.util.Scanner; // program uses class Scanner

public class game
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
	   int gameNum = 0, guess = 0, score = 0, won = 1;
	   
	   Scanner input = new Scanner(System.in);
	   
      System.out.println("Welcome to Number Buster!");
      System.out.print("First player enter number between 0 and 100:");
      gameNum = input.nextInt();
      
      if (gameNum > 0 && gameNum < 100)
      {
    	  
    	  System.out.print("Second Player, enter number between 0 and 100: ");
    	  guess = input.nextInt();
      
      
    	  while( guess != gameNum )
    	  {
    		  if (guess < gameNum)
    			  System.out.println("Your guess is lower than the correct answer.");
    		  else if (guess > gameNum)
    			  System.out.println("Your guess is higher than the correct answer.");
    		  ++score;
    		  System.out.print("Guess number between 0 and 100:");
    		  guess = input.nextInt();
    	  }
      }
      
      else
      {
    	  System.out.println("Number must be between 0 and 100.");
    	  won = 2;
      }
      if (won != 2)
    	  System.out.printf("%s%d%s", "You win!  It took ", score, " guesses.");
   }
}