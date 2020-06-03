package assignments.assignment4;

import java.util.Scanner;

public class question12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your chosen package a,b or c");
		char pack = input.next().charAt(0);
		
		Scanner inputb = new Scanner(System.in);
		System.out.println("Enter number of hours");
		int hours = inputb.nextInt();
		
		double total = 0;
		
		switch(pack) {
		
		case 'A':
		case 'a':
			total = 13.95;
			if(hours > 10)
				total += ((hours -10)*2);
			break;
		case 'B':
		case 'b':
			total = 13.95;
			if(hours > 20)
				total += (hours -20);
			break;
		case 'C':
		case 'c':
			total = 19.95;
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println("Total:" + total);

		
	}

}
