import java.util.Scanner;

public class TheWorstNUmber
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int number;
		int i=7;
		System.out.print("TEH WORST NUMBER GESSING GAME EVAR!!!!!!!!! ");
		System.out.println();
		System.out.print("I'M THINKING OF A NUMBER FROM 1-10. TRY 2 GESS! ");
		number = keyboard.nextInt();
		if (number==i)
			System.out.println("THAT'S RIGHT. YOU WIN. IT'S "+i);
		else
			System.out.println("SORRY. YOU WRONG. IT'S "+i);
	}		
}