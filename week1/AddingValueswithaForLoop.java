import java.util.Scanner;
public class AddingValueswithaForLoop
{
    public static void main( String[] args )
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.print("Number: ");
    	int x = keyboard.nextInt();
    	int sum = 0;
        for ( int i = 1 ; i <= x ; i = i+1 )
        {
            System.out.print( i+" ");
        	sum=sum+i;
        	System.out.println();
        }
        System.out.print("The sum is "+sum);

    }
}