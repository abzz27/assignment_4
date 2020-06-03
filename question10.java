package assignments.assignment4;

import java.util.Scanner;

public class question10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter calories and grams of fat");
		int cal = input.nextInt();
		int gram_fat = input.nextInt();

		int cal_fat = gram_fat * 9;
		int per_cal_fat = cal_fat / cal;

		if (cal_fat > cal) {
			System.out.println("Invalid Input");
		}else if (per_cal_fat < cal / 3) {
			System.out.println("This food is low in fat");
		}else {
			System.out.println("This food is not low in fat");
		}
	}

}
