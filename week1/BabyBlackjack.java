import java.util.Random;
public class BabyBlackjack
{
    public static void main( String[] args )
    {
    	System.out.println("Baby Blackjack! ");
        Random r = new Random();
    	int x = 1 + r.nextInt(10);
        int y = 1 + r.nextInt(10);
        System.out.println("You drew "+x+" and "+y);
    	System.out.println("Your total is "+(x+y));
        int z = 1 + r.nextInt(10);
        int t = 1 + r.nextInt(10);
        System.out.println("The dealer has "+z+" and "+t);
        System.out.println("Dealer's total is "+(z+t));
        if ((x+y)>(z+t))  System.out.print("YOU WIN!");
        else System.out.println("DEALER WIN!");

    }
}