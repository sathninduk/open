// ex 5
import java.util.Scanner;

public class Ex5 {
	public static void main(String args[]) {
		
		// variable declaration
		String str;
		int count = 0;
		
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		// input string
		System.out.print("Input string: "); // prompt
		str = sc.nextLine();
		
		
		// counter
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') // specific character 'a'
				count++;
		}
		
		// output
		System.out.println("Character count of 'a' is: " + count);
		
	}
}