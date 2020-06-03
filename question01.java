package assignments.assignment4;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Your weight in pounds: ");
		double pounds = input1.nextDouble();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Your height in feet followed by a space then additional inches: ");
		double feet = input2.nextDouble();
		double inches = input2.nextDouble();
		
		double kg = pounds / 2.2;
		double meters = (feet * 12 + inches) * 0.0254;
		double bmi = kg / (meters * meters);
		
		if (bmi < 18.5) {
			System.out.println("Your BMI is" + bmi);
			System.out.println("Your risk factor is Underweight");
		}else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Your BMI is " + bmi);
			System.out.println("Your rist factor is Normal Weight");		
		}else if (bmi >= 25 && bmi < 30) {
			System.out.println("Your BMI is " + bmi);
			System.out.println("Your risk factor is Overweight");			
		}else {
			System.out.println("Your BMI is " + bmi);
			System.out.println("Your risk factor is Obese");
		}
			
		
	}

}
