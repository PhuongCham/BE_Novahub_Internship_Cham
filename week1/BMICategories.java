import java.util.Scanner;

public class BMICategories
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int heightInches,weightPounds;
		double height,weight,bmi;
		System.out.print("Your height in inches: ");
		heightInches = keyboard.nextInt();
		System.out.print("Your weight in pounds: ");
		weightPounds = keyboard.nextInt();
		height = heightInches*0.0254;
		weight=weightPounds*0.45359237;
		bmi=(weight/height);
		System.out.println();
		System.out.println("Your BMI is "+bmi);
		if(bmi<15.0) System.out.println("BMI Category: very severely underweight.");
		else if (bmi<=16&&bmi>=15)System.out.println("BMI Category: severely underweight.");
		else if (bmi>=16.1&&bmi<=18.4) System.out.println("BMI Category: underweight .");
		else if (bmi>=18.5&&bmi<=24.9) System.out.println("BMI Category: normal weight .");
		else if (bmi>=25&&bmi<=29.9) System.out.println("BMI Category: overweight.");
		else if (bmi>=30&&bmi<=34.9) System.out.println("BMI Category: moderately obese.");
		else if	(bmi>=35&&bmi<=39.9) System.out.println("BMI Category: severely obese.");	
		else System.out.println("BMI Category: very severely (or \"morbidly\") obese.");
		
		}
	}
