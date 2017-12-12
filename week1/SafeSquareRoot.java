import java.util.Scanner;
//import java.util.Math;

public class SafeSquareRoot
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int y;
		System.out.println("SQUARE ROOT!");
		System.out.print("Enter a number: ");
		y =keyboard.nextInt();
		while ( y < 0 )
		{
		System.out.println( "You can't take the square root of a negative number, silly.");
		System.out.print("Try again: ");
		y = keyboard.nextInt();
		}
		System.out.println( "The square root of "+y+" is "+Math.sqrt(y));
	}
}