import java.util.Scanner;
import java.util.Random;
public class AddingValuesinaLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("I will add up the numbers you give me.");
		System.out.print("Number: ");
		int x = keyboard.nextInt();
		int sum = 0;
		sum+=x;
		System.out.println("The total so far is "+sum);
		while ( x != 0)
		{
			System.out.print("Number: ");
			x = keyboard.nextInt();
			sum+=x;
			System.out.println("The total so far is "+sum);
		}
		
		System.out.println("The total is "+sum);
		
	}
}