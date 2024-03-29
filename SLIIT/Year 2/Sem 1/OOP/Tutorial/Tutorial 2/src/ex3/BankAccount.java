package ex3;

public class BankAccount {

	private int acc_number;
	private String acc_name;
	double balance;
	
	// default constructors
	public BankAccount() {
		this.acc_number = 0;
		this.acc_name = null;
		this.balance = 0.0;
	}
	
	// overloaded constructor
	public BankAccount(int acc_number, String acc_name, double balance) {
		this.acc_number = acc_number;
		this.acc_name = acc_name;
		this.balance = balance;
	}
	
	// getter
	public double getBalance() {
		return this.balance;
	}
	
	// setter
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// deposit method
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	// withdraw method
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	// display method
	public void display() {
		System.out.println("Account Number: " + this.acc_number);
		System.out.println("Account Holder: " + this.acc_name);
		System.out.println("Balance: LKR " + this.balance + "\n");
	}
	
}
