import java.util.Scanner;

public class ex3 {
	public static void main(String args[]) {
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		//variable declaration
		double length, width, height, volume;
		
		// input
		System.out.print("Input length: "); // prompt
		length = sc.nextDouble();
		
		System.out.print("Input width: "); // prompt
		width = sc.nextDouble();
		
		System.out.print("Input height: "); // prompt
		height = sc.nextDouble();
		
		// calculation
		volume = length * width * height;
		
		// output
		System.out.println("Volume: " + volume);
	}
}