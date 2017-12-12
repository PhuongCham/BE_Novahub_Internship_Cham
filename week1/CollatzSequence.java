import java.util.Scanner;

public class CollatzSequence
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Starting number: ");
		int count=0,max=0;
		int x =keyboard.nextInt();
		System.out.print(x);
		max=x;
		while (x!=1){
			if (x%2==0){
				x=x/2;
				System.out.print("   "+x);
				count++;
				if(max<x) max=x;
			}
			else {
				x=3*x+1;
				System.out.print("   "+x);
				count++;
				if(max<x) max=x;
			}
		}
		System.out.println("Terminated after "+count+" steps. The largest value was "+max);
		
	}
}