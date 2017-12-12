import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x = 1 + r.nextInt(10);
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.print("Your guess: ");
		int y =keyboard.nextInt();
		System.out.println();

		if ( y != x )
		{
			System.out.println( "Sorry, but I was really thinking of " + x);
		}
		else System.out.println( "That's right!  My secret number was "+ y);
	}
}