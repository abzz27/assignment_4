package assignments.assignment4;

import java.util.Scanner;

public class question14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of books");
		int book = input.nextInt();
		int point = 0;
		switch(book) {

		case 0:
			point = 0;
			break;
		case 1:
			point = 5;
			break;
		case 2:
			point = 15;
			break;
		case 3:
			point = 30;
			break;
		case 4:
			point = 60;
			break;
		default:
			point = 0;
			System.out.println("Invalid Input");
			break;
		}
		System.out.println("You have earned " + point + " points");
	}

}
