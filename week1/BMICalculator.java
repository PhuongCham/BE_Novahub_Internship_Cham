import java.util.Scanner;

public class BMICalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int heightFeet,heightInches,weightPounds;
		double height,weight;
		
		System.out.print("Your height (feet only): ");
		heightFeet = keyboard.nextInt();
		System.out.print("Your height (inches): ");
		heightInches = keyboard.nextInt();
		System.out.print("Your weight in pounds: ");
		weightPounds = keyboard.nextInt();
		height = heightInches*0.0254+heightFeet*0.3048;
		weight=weightPounds*0.45359237;
		System.out.println();
		System.out.println("Your BMI is "+(weight/height));
		 }
}