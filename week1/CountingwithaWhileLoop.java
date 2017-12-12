import java.util.Scanner;

public class CountingwithaWhileLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it ten times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.print("How many times? ");

		int n = keyboard.nextInt();
		int m=0;
		while ( m < n )
		{
			System.out.println( (m+1)*10 + ". " + message );
			m++;
		}

	}
}