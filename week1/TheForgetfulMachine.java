import java.util.Scanner;

public class TheForgetfulMachine
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int favNumber1,favNumber2;
		String word,word2;

		System.out.println( "Give me a world! " );
		word = keyboard.next();

		System.out.println( "Give me a second word! " );
		word2 = keyboard.next();
		System.out.println("");
		System.out.println( "Great, now your favorite number? " );
		favNumber1 = keyboard.nextInt();

		System.out.println( "And your second favotite number " );
		favNumber2 = keyboard.nextInt();
		System.out.println("");
		System.out.println( "Whew! Wasn't that fun?" );
	}
}