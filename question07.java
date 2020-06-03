package assignments.assignment4;

import java.util.Scanner;

public class question07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of seconds");
		int seconds = input.nextInt();
		String time = "error";
		int result = 0;
		
		if (seconds < 60) {
			time = "second/s";
			result = seconds;
			System.out.println(seconds + time);
		}else if (seconds >= 60 && seconds < 3600) {
			time  = " minute/s";
			result = seconds / 60;
		}else if (seconds >= 3600 && seconds < 86400) {
			time = "hour/s";
			result = seconds / 3600;
		}else if (seconds >= 86400) {
			time = "day/s";
			result = seconds / 86400;
		}
		System.out.println(seconds + " = " + result + time);

	}

}
