import java.util.Random;

public class ShorterDoubleDice
{
	public static void main( String[] args )
	{
		Random r = new Random();
		System.out.println("HERE COMES THE DICE");
		System.out.println();
		int x,y;
		do
		{
			x = r.nextInt(10);
			System.out.println("Roll #1 : "+x);
			y = r.nextInt(10);
			System.out.println("Roll #2 : "+y);
			System.out.println("The total is "+(x+y));
		}while (x!=y);
		
	}
}