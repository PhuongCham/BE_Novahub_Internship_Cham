import java.util.Scanner;

public class RightTriangleChecker
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter three integers:");
		System.out.print("Side 1: ");
		int z,x =keyboard.nextInt();
		System.out.print("Side 2: ");
		int y =keyboard.nextInt();
		while ( y < x )
		{
		System.out.println( y+ " is smalls than "+x+". Try again.");
		System.out.print("Side 2: ");
		y = keyboard.nextInt();
		}
		System.out.println( "Side 3:");
		z = keyboard.nextInt();
		while ( z < y )
		{
		System.out.println( z+ " is smalls than "+y+". Try again.");
		System.out.print("Side 3: ");
		z = keyboard.nextInt();
		}
		System.out.println();
		System.out.println("Your three sides are "+x+" "+y+" "+z);
		if (z*z==(x*x+y*y))
			System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
		else System.out.println("NO!  These sides do not make a right triangle!");

	}
}