import ex3.BankAccount;
import java.util.Scanner;

public class Ex3 { // class & file names should be BankApp
	public static void main(String args[]) {
		
		// variable declaration
		int ac1, ac2;
		String name1, name2;
		double bal1, bal2, w, d;
		
		// scanner object
		Scanner sc = new Scanner(System.in);
		
		// input
		// object 1
		System.out.println("Account 1");
		
		System.out.print("Input account number: "); // prompt
		ac1 = sc.nextInt();
		
		System.out.print("Input account holder: "); // prompt
		name1 = sc.next();
		
		System.out.print("Input account balance: "); // prompt
		bal1 = sc.nextDouble();
		
		// object 2
		System.out.println("\nAccount 2");
		
		System.out.print("Input account number: "); // prompt
		ac2 = sc.nextInt();
		
		System.out.print("Input account holder: "); // prompt
		name2 = sc.next();
		
		System.out.print("Input account balance: "); // prompt
		bal2 = sc.nextDouble();
		
		// objects
		BankAccount a1 = new BankAccount(ac1, name1, bal1);
		BankAccount a2 = new BankAccount(ac2, name2, bal2);
		
		// output
		System.out.println();
		a1.display();
		a2.display();
	}
}
