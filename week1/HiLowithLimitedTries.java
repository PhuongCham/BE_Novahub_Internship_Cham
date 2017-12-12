import java.util.Scanner;
import java.util.Random;
public class HiLowithLimitedTries
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1-100.  You have 7 guesses.");
		System.out.print("First guess: ");
		int x = keyboard.nextInt();
		Random r = new Random();
		int y = 1+ r.nextInt(100);
		int tries =0;
		tries++;
		while ( y != x && tries<7)
		{
			System.out.println("Sorry, you are too low.");
			tries++;
			System.out.print("Guess #: "+tries);
			x = keyboard.nextInt();
			
		}
		if (y==x) System.out.println("You guess it! What are the odds!");
		else
		System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		
	}
}