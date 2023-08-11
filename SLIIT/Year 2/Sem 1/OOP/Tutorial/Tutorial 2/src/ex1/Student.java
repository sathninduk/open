package ex1;

public class Student {

	private String studentID;
	private String studentName;
	private int sub1, sub2, sub3;
	private double avg;
	
	// constructors
	public Student() {
		studentID = null;
		studentName = null;
		sub1 = 0;
		sub2 = 0;
		sub3 = 0;
	}
	
	public Student(String studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	// setters
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	// getters
	public int getSub1() {
		return this.sub1;
	}
	
	public int getSub2() {
		return this.sub2;
	}
	
	public int getSub3() {
		return this.sub3;
	}
	
	// methods
	public void calculateAvg() {
		this.avg = (sub1 + sub2 + sub3) / 3.0;
	}
	
	public void displayDetails() {
		System.out.println("Student ID: " + this.studentID);
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Student Average: " + this.avg);
	}
}
