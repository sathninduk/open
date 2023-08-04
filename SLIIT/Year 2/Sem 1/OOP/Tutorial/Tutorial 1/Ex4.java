// ex 4
import java.util.Scanner;

public class Ex4 {
	public static void main(String args[]) {
		
		// variable declaration
		String str;
		
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		// input string
		System.out.print("Input string: "); // prompt
		str = sc.nextLine();
		
		// output
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}
}