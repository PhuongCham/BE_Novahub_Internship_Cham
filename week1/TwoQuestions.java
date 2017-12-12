import java.util.Scanner;
public class TwoQuestions
{
	public static void main( String[] args )
	{
		String size,type;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("TWO QUESTIONS!"); 
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println();
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		System.out.print(">" );
		type = keyboard.next();
		System.out.println();
		System.out.println("Question 2) Is it bigger than a breadbox?");
		System.out.print(">" );
		size = keyboard.next();
		System.out.println();
		
		if(type.equals("animal") && size.equals("no")) 
			System.out.println("My guess is that you are thinking of a squirrel.");
		else if (type.equals("animal") && size.equals("yes")) System.out.println("My guess is that you are thinking of a moose.");
		else if (type.equals("vegetable") && size.equals("no")) System.out.println("My guess is that you are thinking of a carrot.");
		else if (type.equals("vegetable") && size.equals("yes")) System.out.println("My guess is that you are thinking of a watermelon.");
		else if (type.equals("mineral") && size.equals("no")) System.out.println("My guess is that you are thinking of a paper clip.");
		else if (type.equals("mineral") && size.equals("yes")) System.out.println("My guess is that you are thinking of a Camaro.");
		
		System.out.println("I would ask you if I'm right, but I don't actually care.");}
}
