import java.util.Scanner;
public class SpaceBoxing
{
	public static void main( String[] args )
	{
		int number;double weight;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your current earth weight: ");
		weight = keyboard.nextDouble();
		System.out.println();
		System.out.println("I have information for the following planets:");
		System.out.println("      1. Venus     2. Mars      3. Jupiter");
		System.out.println("      4. Saturn    5. Uranus    3. Neptune");
		System.out.println();
		System.out.print("Which planet are you visiting? ");
		number = keyboard.nextInt();
		System.out.println();
		if(number==1)
		{
			System.out.println("Your weight would be "+(weight*0.78)+" pounds on that planet");
		}
		else if (number==2)
		{
			System.out.println("Your weight would be "+(weight*0.39)+" pounds on that planet");
		}
		else if (number==2)
		{
			System.out.println("Your weight would be "+(weight*2.65)+" pounds on that planet");
		}
		else if (number==4)
		{
			System.out.println("Your weight would be "+(weight*1.17)+" pounds on that planet");
		}
		else if (number==5)
		{
			System.out.println("Your weight would be "+(weight*1.05)+" pounds on that planet");
		}
		else 
		{
			System.out.println("Your weight would be "+(weight*1.23)+" pounds on that planet");
		}

	}
}