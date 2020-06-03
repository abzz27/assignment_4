package assignments.assignment4;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mass");
		int mass = input.nextInt();
		double weight = mass * 9.8;
		String object  = "OK";
		
		if (weight >1000) {
			object = "too heavy";
		}else if (weight < 10) {
			object = "too light";
		}
		System.out.println("object weight is " + weight + " Newtons");
		System.out.println("object is " + object);

		
	}

}
