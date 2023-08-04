// ex 2
import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		
		// variable declaration
		int x, counter = 0, sum = 0;
		float avg;
		
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		// input number
		System.out.print("Input number: "); // prompt
		x = sc.nextInt();
		
		while (x >= 0) {
			sum += x;
			counter++;
			
			// input number
			System.out.print("Input number: "); // prompt
			x = sc.nextInt();
		}
		
		// average calculation
		avg = (float) sum / counter;
		
		// output
		System.out.println("Average = " + avg);
		
	}
}