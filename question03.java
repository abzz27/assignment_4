package assignments.assignment4;

import java.util.Scanner;

public class question03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year");
		int year = input.nextInt();
		
		boolean leap_year = (year % 4) == 0;
		
		if (leap_year) {
			System.out.println(year + " Leap Year");
		}else {
			System.out.println(year + " Not a Leap Year");
		}
	}

}
