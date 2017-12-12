import java.util.Scanner;
public class TwoMoreQuestions
{
	public static void main( String[] args )
	{
		String choose1,choose2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("TWO MORE QUESTIONS, BABY!"); 
		System.out.println();
		System.out.println("Think of something and I'll try to guess it.");
		System.out.println();
		System.out.print("Question 1) Does it stay inside or outside or both?");
		choose1 = keyboard.next();
		System.out.println("Question 2) Is it a living thing? ");
		
		choose2 = keyboard.next();
		System.out.println();
		
		if(choose1.equals("inside") && choose2.equals("no")) 
			System.out.println("Then what else could you be thinking of besides a shower curtain?");
		else if (choose1.equals("inside") && choose2.equals("yes")) System.out.println("Then what else could you be thinking of besides a houseplant?!?");
		else if (choose1.equals("outside") && choose2.equals("no")) System.out.println("Then what else could you be thinking of besides a billboard?!?");
		else if (choose1.equals("outside") && choose2.equals("yes")) System.out.println("Then what else could you be thinking of besides a bison?!?");
		else if (choose1.equals("both") && choose2.equals("no")) System.out.println("Then what else could you be thinking of besides a cell phone?!?");
		else  System.out.println("Then what else could you be thinking of besides a dog?!?");
	}	
		
}
