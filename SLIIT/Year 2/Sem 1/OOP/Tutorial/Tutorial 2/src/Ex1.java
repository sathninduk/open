import ex1.Student;
import java.util.Scanner;

public class Ex1 {
 public static void main (String args[]) {
	 
	String id, name;
	int sub1, sub2, sub3;
	
	// scanner object
	Scanner sc = new Scanner(System.in);
	 
	// input student id
	System.out.print("Input student ID: ");
	id = sc.next();
	
	// input student name
	System.out.print("Input student name: ");
	name = sc.next();
	 
	// input mark 1
	System.out.print("Input subject 1 mark: ");
	sub1 = sc.nextInt();
	 
	// input mark 2
	System.out.print("Input subject 2 marks ");
	sub2 = sc.nextInt();
		 
	// input mark 3
	System.out.print("Input subject 3 marks: ");
	sub3 = sc.nextInt();
	
	// Student object
	Student st1 = new Student(id, name);
	
	// set subject marks
	st1.setSub1(sub1);
	st1.setSub2(sub2);
	st1.setSub3(sub3);
	
	// calculate average
	st1.calculateAvg();
	
	// output
	st1.displayDetails();
	 
 }
}
