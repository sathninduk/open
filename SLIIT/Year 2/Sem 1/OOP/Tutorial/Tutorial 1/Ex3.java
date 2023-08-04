// ex 3
import java.util.Scanner;

public class Ex3 {
	public static void main(String args[]) {
		
		// variable declaration
		int x;
		
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		// input number
		System.out.print("Input integer: "); // prompt
		x = sc.nextInt();
		
		// output
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " x " + i + " = " + (x * i));
		}
		
	}
}