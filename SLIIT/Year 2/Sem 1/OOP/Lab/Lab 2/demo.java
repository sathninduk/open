import java.util.Scanner;

// EvenOddNumber class
class EvenOddNumber {
	boolean findEvenOrOdd(int i) {
		return i % 2 == 0 ? true : false;
	}
	
	private void test() {
		//
	}
}

public class demo {
	public static void main(String args[]) {
		
		// variable declaration
		int num;
		
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		// object
		EvenOddNumber obj = new EvenOddNumber();
		
		// input
		System.out.print("Input number: ");
		num = sc.nextInt();
		
		// method call
		boolean x = obj.findEvenOrOdd(num);
		
		// output
		System.out.println("Number is even: " + x);
	}
}

