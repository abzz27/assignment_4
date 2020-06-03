package assignments.assignment4;

public class question04 {

	public static void main(String[] args) {
		int minimum = 200;
		int calls = 210;
		double bill = 200;
		
		if (calls <= 100) {
			bill = minimum;
		}else if (calls > 100 && calls <= 150) {
			bill = (((calls - 100) * 0.6) + minimum) ;
		}else if (calls > 150 && calls <= 200) {
			bill = (((calls - 100) * 0.5) + minimum) ;
		}else if (calls > 200) {
			bill = (((calls - 100) * 0.4) + minimum) ;
		}
		System.out.println("Your monthly telephone bill is $" + bill);
	}

}
