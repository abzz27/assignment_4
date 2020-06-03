package assignments.assignment4;

import java.util.Scanner;

public class question09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter weight(lbs)");
		double weight = input.nextDouble();
		double rate = 0;
		
		if (weight <= 2) {
			rate = 1.1;
		}else if (weight > 2 && weight <= 6) {
			rate = 2.2;
		}else if (weight > 6 && weight <= 10) {
			rate = 3.7;
		}else if (weight > 10) {
			rate = 3.8;
		}else {
			weight = 0;
			rate = 0;
			System.out.println("Invalid Input");
		}
		System.out.println("Weight of package(lbs)" + " | Rate per 500 miles shipped($)");
		System.out.println(" " + weight + "                      " + rate );
	}

}
