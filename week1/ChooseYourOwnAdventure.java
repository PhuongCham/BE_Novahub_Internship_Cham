import java.util.Scanner;
public class ChooseYourOwnAdventure
{
	public static void main( String[] args )
	{
		String choose1, choose2, choose3;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!"); 
		System.out.println();
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
		System.out.print(">" );
		choose1 = keyboard.next();
		System.out.println();
		System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
		System.out.print(">" );
		choose2 = keyboard.next();
		System.out.println();
		System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
		System.out.print(">" );
		choose3 = keyboard.next();
		System.out.print(">" );

		if(choose1.equals("kitchen") ) {
			if(choose2.equals("cabinet") ){
				if(choose3.equals("no") ){
					System.out.println("Well, then I guess you'll never know what was in there.( "+choose1+"->"+choose2+"->"+choose3 +"). Thanks for playing, I'm tired of making nested if statements.");
				}else System.out.println("Well, then I guess you'll never know what was in there.("+choose1+"->"+choose2+"->"+choose3+ "). Thanks for playing, I'm tired of making nested if statements.");
			}else {
				if(choose3.equals("no") ){
					System.out.println("Well, then I guess you'll never know what was in there.("+choose1+"->"+choose2+"->"+choose3 +"). Thanks for playing, I'm tired of making nested if statements.");
				}else System.out.println("Well, then I guess you'll never know what was in there.("+choose1+"->"+choose2+"->"+choose3 +"). Thanks for playing, I'm tired of making nested if statements.");
			}
			
		}else {
			if(choose2.equals("cabinet") ){
				if(choose3.equals("no") ){
					System.out.println("Well, then I guess you'll never know what was in there.("+choose1+"->"+choose2+"->"+choose3+ "). Thanks for playing, I'm tired of making nested if statements.");
				}else System.out.println("Well, then I guess you'll never know what was in there.("+choose1+"->"+choose2+"->"+choose3 +"). Thanks for playing, I'm tired of making nested if statements.");
			}else {
				if(choose3.equals("no") ){
					System.out.println("Well, then I guess you'll never know what was in there.("+choose1+"->"+choose2+"->"+choose3 +"(. Thanks for playing, I'm tired of making nested if statements.");
				}else System.out.println("Well, then I guess you'll never know what was in there.("+choose1+"->"+choose2+"->"+choose3 +"). Thanks for playing, I'm tired of making nested if statements.");
			}
		}
	}
}
