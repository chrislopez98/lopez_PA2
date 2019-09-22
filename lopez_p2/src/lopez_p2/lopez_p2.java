package lopez_p2;

import java.util.Scanner;

public class lopez_p2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Hello! Welcome to the BMI caculator, would you like to use formula 1 (Imperial) or formula 2 (Metric) today? (Please type 1 or 2)");
		int testCase = scnr.nextInt();
		
		if(testCase == 1) {
			System.out.println("Please enter user's weight in pounds:");
			int userWeightPounds = scnr.nextInt();
			System.out.println("Please enter user's height in inches:");
			int userHeightInches = scnr.nextInt();
			int bmiImperial = ((703 * userWeightPounds) / (userHeightInches * userHeightInches));
			System.out.println("User's Body Mass Index is: " + bmiImperial);
			System.out.println("Below are categories of BMI according to the National Heart Lung and Blood Institute");
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
			
			
		}
		else if(testCase == 2) {
			System.out.println("Please enter user's weight in kilograms:");
			int userWeightKG = scnr.nextInt();
			System.out.println("Please enter user's height in meters:");
			int userHeightMeters = scnr.nextInt();
			int bmiMetric = ((userWeightKG) / (userHeightMeters * userHeightMeters));
			System.out.println("User's Body Mass Index is: " + bmiMetric);	
			System.out.println("Below are categories of BMI according to the National Heart Lung and Blood Institute");
			System.out.println("BMI Categories:");
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");
		}
		else {
			System.out.println("Invalid test type");
		}
		
		
		
		
	}

}
