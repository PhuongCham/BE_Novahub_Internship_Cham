import java.util.Scanner;
public class AgeMessages
{
	public static void main( String[] args )
	{
		int age;
		String name;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Your name: ");
		name = keyboard.next();
		System.out.print("Your age: ");
		age = keyboard.nextInt();
		System.out.println();
		if(age<16)
		{
			System.out.println("You can't drive, "+name);
		}
		else if (16<=age&&age<=17)
		{
			System.out.println("You can drive but not vote, "+name);
		}
		else if (18<=age && age<=24)
		{
			System.out.println("You can vote but not rent a car, "+name);
		}
		else 
		{
			System.out.println("You can do pretty much anything, "+name);
		}

	}
}