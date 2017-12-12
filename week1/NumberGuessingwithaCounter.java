import java.util.Scanner;
import java.util.Random;
public class NumberGuessingwithaCounter
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
		System.out.print("Your guess: ");
		int x = keyboard.nextInt();
		Random r = new Random();
		int y = 1+ r.nextInt(10);
		int tries =0;
		tries++;
		while ( y != x )
		{
			System.out.println("That is incorrect. Guess again.");
			System.out.print("Your guess: ");
			x = keyboard.nextInt();
			tries++;
		}
		System.out.println("That's right!  You're a good guesser.\nIt only took you "+tries+" tries.");
		
	}
}