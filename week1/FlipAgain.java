import java.util.Scanner;
import java.util.Random;

public class FlipAgain
{
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        String str;
        int x;
        do {
            x = 1 + r.nextInt(2);
        if (x==1){System.out.print("You flip a coin and it is... TAILS\nWould you like to flip again (y/n)? ");
        str = keyboard.next();}
        else {System.out.print("You flip a coin and it is... HEADS\nWould you like to flip again (y/n)? ");
        str = keyboard.next();
         }
     }while (str.equals("y"));
}
}