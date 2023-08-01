import java.util.Scanner;

public class Lab1 {
	public static void main(String args[]) {

		// ex 1 ==========================================================================
		System.out.println("Exercise 1\n");
		
		System.out.println("Hello World!\nIt's been nice knowing you.\nGoodbye world!");

		
		// ex 2	==========================================================================
		System.out.println("\nExercise 2\n");
		
		System.out.println("==================================");
		System.out.println("=\tStudent Information\t\t=");
		System.out.println("==================================");
		System.out.println("= Name\t\t:ARDP Ranasignhe\t=");
		System.out.println("= Reg No\t:DIS\\08\\M4\\1234\t\t=");
		System.out.println("= Address\t:Malabe\t\t\t=");
		System.out.println("==================================");
		
		
		// ex 3 ==========================================================================
		System.out.println("\nExercise 3\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age: ");
		int i = sc.nextInt();
		
		if (i >= 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Child");
		}
		
		
		// ex 4 ==========================================================================
		System.out.println("\nExercise 4\n");
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Value of the day: ");
		int date = sc2.nextInt();;;
		
		switch (date) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid Day");	
		}
		
		System.out.println("Good Bye!");
		

		// ex 5 ==========================================================================
		System.out.println("\nExercise 5\n");
		
		// length
		int x = 5;
		
		// rectangle
		for (int i1 = 1; i1 <= x; i1++) {
			for (int j = 1; j <= x; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// line
		System.out.println();
		
		// triangle
		for (int i1 = 1; i1 <= x; i1++) {
			for (int j = 1; j <= i1; j++) {
				if (j == 1) {
					for (int k = 1; k <= (x - i1); k++) {
						System.out.print(" ");
					}
				}
				System.out.print("* ");
			}
		 	// new line
			System.out.println();
		}
		
		
		// ex 6 ==========================================================================
		System.out.println("\nExercise 6\n");
		
		// length
		int x1 = 5;	
				
		// line counter
		for (int i1 = 1; i1 <= x1; i1++) {
			
			// rectangle
			for (int j = 1; j <= x1; j++) {
				System.out.print("* ");
			}
			
			// formatting whitespace
			System.out.print(" ");
			
			// triangle
			for (int b = 1; b <= i1; b++) {
				if (b == 1) {
					for (int c = 1; c <= (x1 - i1); c++) {
						System.out.print(" ");
					}
				}
				System.out.print("* ");
			}
			
			// new line
			System.out.println();
		}
		
		
		// ex 7 ==========================================================================
		System.out.println("\nExercise 7\n");
		
		// Scanner object
		Scanner sc1 = new Scanner(System.in);
		
		// number 1
		System.out.print("Enter number 1: "); // prompt
		int x11 = sc1.nextInt();
		
		// number 2
		System.out.print("Enter nunmber 2: "); // prompt
		int y = sc1.nextInt();
		
		// summation
		int sum = x11 + y;
		
		// average
		float avg = (float)x11 / y;
		
		// output
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	
		
		// end ==========================================================================
		System.out.println("\nEnd of the labsheet 1 - OOP");
		
	}
}
