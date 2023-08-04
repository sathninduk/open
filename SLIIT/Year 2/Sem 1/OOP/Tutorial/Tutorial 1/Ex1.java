//ex 1
import java.util.Scanner;

public class Ex1 {
	public static void main(String args[]) {
		
		// variable declaration
		int x, y = 1;
		
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		// input positive integer
		System.out.print("Input positive integrer: "); // prompt
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.print("Number cannot be negative");
		} else {
			for (int i = 1; i <= x; i++) {
				y *= i;
			}	
			System.out.println("Factorial of " + x + " is: " + y);
		}
		
	}
}