package assignments.assignment4;

import java.util.Scanner;

public class question05 {

	public static void main(String[] args) {
		//6/10/60
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter date (mm dd yy) " );
		int month = input2.nextInt();
		int day = input2.nextInt();
		int year = input2.nextInt();
		
		if ((month >= 1 && month <= 12) && (day >=1 && day <= 31));{
			System.out.println(month + "/" + day + "/" + year);
			if ((month * day) == year) {
				System.out.println("The date is magic");
			}else {
				System.out.println("The date is NOT magic");
			}
		}

	
		System.out.println("Invalid Input");
	}

}
