package day03.solved;

// Creating a class called Account2
class Account2 {

	// Declaring the variables and setting the access modifier as private
	private String accNo;
	private String name;
	private double balance;

	// Default Constructor
	public Account2() {

	}

	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public Account2(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	// Creating getters and setter for those variables
	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

public class TestAccount2 {
	public static void main(String[] args) {

		// Create Account using Setter methods and Default constructor
		Account2 acct1 = new Account2();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);

		System.out.println(acct1.getAccNo() + "-" + acct1.getName() + "-" + acct1.getBalance());

		// Create Account with Overloaded constructor accepting parameters
		Account2 acct2 = new Account2("A102", "Arun", 1000);
		System.out.println(acct2.getAccNo() + "-" + acct2.getName() + "-" + acct2.getBalance());

	}
}