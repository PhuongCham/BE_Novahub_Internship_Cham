import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\nHe glances at you out of the corner of his eye and starts shuffling.\nHe lays down three cards.");
		System.out.println();
		System.out.println("Which one is the ace?");
		System.out.println();
		System.out.println("          ##  ##  ##\n          ##  ##  ##");
		System.out.println("           1   2   3");
		System.out.println();
		System.out.print("> ");
		int x = 1 + r.nextInt(3);
		int y = keyboard.nextInt();
		System.out.println();
		if(x==y) System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
			else System.out.println("Ha! Fast Eddie wins again! The ace was card number"+x);

		if(x==1) System.out.println("          AA  ##  ##\n          AA  ##  ##\n           1   2   3");
		else if(x==2) System.out.println("          ##  AA  ##\n          ##  AA  ##\n           1   2   3");
		else System.out.println("          ##  ##  AA\n          ##  ##  AA\n           1   2   3");

		
	}
}