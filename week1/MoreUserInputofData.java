import java.util.Scanner;

public class MoreUserInputofData
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int grade,id;
		String firstName,lastName,login;
		double gpa;
		System.out.println("Please enter the following information so I can sell it for a profit!");
		System.out.println("");
		System.out.print( "First Name: " );
		firstName = keyboard.next();
		System.out.print("Last Name: " );
		lastName = keyboard.next();
		System.out.print( "Grade (9-12): ");
		grade = keyboard.nextInt();
		System.out.print("Student ID: ");
		id = keyboard.nextInt();
		System.out.print("Login: ");
		login = keyboard.next();
		System.out.print("GPA (0.0-4.0): ");
		gpa = keyboard.nextDouble();
		System.out.println("");
		System.out.println("Your information:");
		System.out.println("	LOgin: "+login);
		System.out.println("	ID:    "+id);
		System.out.println("	Name:  "+lastName+", "+firstName);
		System.out.println("	GPA:   "+gpa);
		System.out.println("	Grade: "+grade);
	}
}