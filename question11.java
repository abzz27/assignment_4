package assignments.assignment4;

import java.util.Scanner;

public class question11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter medium, air, water or steel");
		String medium = input.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter the distance the sound wave will travel(ft)");
		int distance = input.nextInt();
		
		int speed = 0; 
		float time = 0f;
		
		switch(medium) {
		
		case "air":
			speed = 1100;
			break;
		case "water":
			speed = 4900;
			break;
		case "steel":
			speed = 16400;
			break;
		default : 
			System.out.println("Invalid Input");
		}
		time = distance / speed;
		System.out.println("The sound waves will take " + time + " seconds to travel through " + distance + " feet of " + medium + ", travelling at " + speed + " feet per second");
	}

}
