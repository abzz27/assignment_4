package assignments.assignment4;

import java.util.Scanner;

public class question02 {

	public static void main(String[] args) {
		
		double tax_rate = 0;
		double tax_amount = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Your income: ");
		double income = input.nextDouble();
		
		if (income <= 150_000) {
			tax_rate = 0.25;		
		}else if (income <= 300_000) {
			tax_rate = 0.3;
		}else if (income <= 600_000) {
			tax_rate = 0.35;
		}else if (income <= 1_200_000) {
			tax_rate = 0.4;
		}else if (income > 1_200_000){
			tax_rate = 0.5;
		}
		tax_amount = income * tax_rate;
		System.out.println("Your Income: " + income);
		System.out.println("the tax amount you have to pay: " + tax_amount);
	}

}
