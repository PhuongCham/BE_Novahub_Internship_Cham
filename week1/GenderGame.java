import java.util.Scanner;

public class GenderGame
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String gender,firstName,lastName,choose;
		System.out.print("What is your gender (M or F): ");
		gender = keyboard.next();
		System.out.print("First name: ");
		firstName = keyboard.next();
		System.out.print("Last name: ");
		lastName = keyboard.next();
		System.out.print("Age: ");
		age = keyboard.nextInt();
		System.out.println();
		if (age<18) System.out.println("Then I shall call you "+firstName+" "+lastName);
		else{
			if (gender.equals("F")){
			System.out.print("Are you married, "+firstName+" (y or n)? ");
			choose = keyboard.next();
			System.out.println();
			if (choose.equals("y")) System.out.println("Then I shall call you Mrs."+lastName);
			else System.out.println("Then I shall call you Ms."+lastName);
		}else System.out.println("Then I shall call you Mr."+lastName);

		
		

		
		}
	}
}