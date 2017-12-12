import java.util.Scanner;

public class CompareTo
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String str1,str2;
		int i;
		System.out.println("Comparing string1 with string2 produces: ");
		System.out.print( "String 1: ");
		str1 = keyboard.next();
		System.out.print( "String 2: ");
		str2 = keyboard.next();
		i = str1.compareTo(str2);
		System.out.println( "Comparing "+str1+" with "+str2+" produces "+i);
		
		
	}
}