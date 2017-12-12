import java.util.Random;
import java.util.Scanner;

public class AgainwiththeNumberGuessing
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int x = 1 + r.nextInt(10);
		int y,tries=0;
		System.out.println("I have chosen a number between 1 and 10.  Try to guess it.");
		do{
		System.out.print("Your guess: ");
		y =keyboard.nextInt();
		tries++;
		if ( y != x )
		{
			System.out.println( "That is incorrect.  Guess again.");
		}
	}while (y!=x);
		System.out.println( "That's right!  You're a good guesser.\nIt only took you "+tries+ "tries.");
	}
}