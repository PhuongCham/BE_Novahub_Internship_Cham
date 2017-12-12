import java.util.Random;

public class Dice
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		System.out.println("HERE COMES THE DICE");
		int x = 1 + r.nextInt(6);
		System.out.println();
		System.out.println(" Roll #1: "+x);
		int y = 1 + r.nextInt(6);
		System.out.println(" Roll #2: "+y);
		System.out.println("The total is "+(x+y));
	}
}