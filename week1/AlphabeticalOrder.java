import java.util.Scanner;

public class AlphabeticalOrder
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String str;
		int i;
		System.out.print("What is your last name? ");
		str = keyboard.next();
		if (str.compareTo("Carswell")<=0)
			System.out.println( "You don't have to wait long, "+str);
		else if (str.compareTo("Carswell")>0&&str.compareTo("Jones")<=0)
			System.out.println( "That's not bad, "+str);
		else if (str.compareTo("Jones")>0&&str.compareTo("Smith")<=0)
			System.out.println( "Looks like a bit of a wait, "+str);
		else if (str.compareTo("Smith")>0&&str.compareTo("Young")<=0)
			System.out.println( "It's gonna be a while, "+str);
		else if (str.compareTo("Young")>0) System.out.println( "Not going anywhere for a while? "+str);
	}
}