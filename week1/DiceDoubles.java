import java.util.Scanner;
import java.util.Random;

public class DiceDoubles
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
	

		System.out.println("HERE COMES THE DICE");
		System.out.println();
		int x = r.nextInt(10);
		System.out.println("Roll #1 : "+x);
		int y = r.nextInt(10);
		System.out.println("Roll #2 : "+y);
		System.out.println("The total is "+(x+y));

		while ( y != x )
		{
			x = r.nextInt(10);
			System.out.println("Roll #1 : "+x);
			y = r.nextInt(10);
			System.out.println("Roll #2 : "+y);
			System.out.println("The total is "+(x+y));
		}
		
	}
}