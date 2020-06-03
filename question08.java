package assignments.assignment4;

import java.util.Scanner;

public class question08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter quantity");
		int quantity = input.nextInt();
		
		int price;
		price = 99;
		
		double discount_amount = 0, discount_rate = 0, total = 0;
		
		if (quantity >= 10 && quantity <= 19) {
			discount_rate = 0.2;
		}else if (quantity >= 20 && quantity <= 49) {
			discount_rate = 0.3;
		}else if (quantity >= 50 && quantity <= 99) {
			discount_rate = 0.4;
		}else if (quantity >= 100) {
			discount_rate = 0.5;
			}
		discount_amount = discount_rate * (quantity * price);
		total = (quantity * price) - discount_amount; 
		
		System.out.println(quantity + " x $" + price);
		System.out.println("$" + (quantity * price));
		System.out.println((discount_rate * 100) + "% discount");
		System.out.println("$" + discount_amount + " saved");
		System.out.println("Total :" + total);
		}
	}


