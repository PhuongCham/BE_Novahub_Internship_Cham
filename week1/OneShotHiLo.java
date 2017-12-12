import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		int x = 1 + r.nextInt(100);
		System.out.print("> ");
		int y = keyboard.nextInt();
		System.out.println(); 
		if (y==x) System.out.println("You guess it! What are the odds!");
		else System.out.println("Sorry, you are too low. I was thinking of "+x);

		
	}
}