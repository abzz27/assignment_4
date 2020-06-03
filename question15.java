package assignments.assignment4;

import java.util.Scanner;

public class question15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int num = input.nextInt();
		
		switch(num) {
		
		case 0:
		case 1:
		case 2:
			System.out.println("Low Number");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Medium Number");
			break;
		default:
			System.out.println("Other Number");
			break;
		}
	}

}
