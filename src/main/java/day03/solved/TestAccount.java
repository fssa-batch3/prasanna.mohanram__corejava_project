package day03.solved;

// Creating a class Account
class Account {

	// Declaring the variables accNo, name and balance as public
	public String accNo;
	public String name;
	public double balance;

	// Creating the constructor Account
	public Account(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
}

public class TestAccount {

	public static void main(String[] args) {

		// Calling the constructor from the class Account and passing the parameters
		Account acct1 = new Account("A101", "Naresh", 1000);
		// Printing the accNo, name and balance using the constructor
		System.out.println(acct1.accNo + "-" + acct1.name + "-" + acct1.balance);

		// Calling the constructor from the class Account and passing the parameters
		Account acct2 = new Account("A102", "Arun", 1000);
		// Printing the accNo, name and balance using the constructor
		System.out.println(acct2.accNo + "-" + acct2.name + "-" + acct2.balance);
	}

}
