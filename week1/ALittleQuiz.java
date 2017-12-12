import java.util.Scanner;
public class ALittleQuiz
{
	public static void main( String[] args )
	{
		int count=0,number1,number2,number3;String ready;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Are you ready for a quiz? ");
		ready = keyboard.next();
		System.out.println("Okay, here it comes1");
		System.out.println();
		System.out.println("Q1) WHat is the capital os Alaska?");
		System.out.println("1) Melbourne");
		System.out.println("2) Anchorage");
		System.out.println("3) Juneau");
		System.out.println();
		System.out.print(">"); number1 = keyboard.nextInt();
		System.out.println();
		if(number1==3) {System.out.println("That's right!");count++;}
		else System.out.println("Sorry, you're wrong!");
		System.out.println();
		System.out.println("Q2) Can you store the value 'cat' in a variable of type int?");
		System.out.println("1) Yes");
		System.out.println("2) NO");
		System.out.println();
		System.out.print(">"); number2 = keyboard.nextInt();
		System.out.println();
		if(number2==2) {System.out.println("That's right!");count++;}
		else System.out.println("Sorry, 'cat' is a string. ints can only store numbers!");
		System.out.println();
		System.out.println("Q3) Can you store the value 'cat' in a variable of type intWhat is the result of 9+6/3?");
		System.out.println("1) 5");
		System.out.println("2) 11");
		System.out.println("1) 15/3");
		System.out.println();
		System.out.print(">"); number3 = keyboard.nextInt();
		System.out.println();
		if(number3==2) {System.out.println("That's right!");count++;}
		else System.out.println("Sorry, you're wrong!");
		System.out.println();
		System.out.println("Overall, you got "+count+ " out of 3 correct");
		System.out.println("Thanks for playing!");
	}
}