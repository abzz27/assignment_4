package assignments.assignment4;

import java.util.Scanner;

public class question13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of checks");
		int checks = input.nextInt();
		
		int base = 10;
		double total = 0;
		
		if (checks < 20) {
			total = base + (checks * 0.10);
		}else if (checks >= 20 && checks <= 39) {
			total = base + (checks * 0.08);	
		}else if (checks >= 40 && checks <= 59) {
			total = base + (checks * 0.06);	
		}else if (checks >= 60) {
			total = base + (checks * 0.04);	
		}
		System.out.println("Your monthly bank fees are " + total);
	}

}
