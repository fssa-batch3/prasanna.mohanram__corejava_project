package day05.practice;

class Account {
	private String accNo;
	private double balance;

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public double getBalance() {
		return balance;
	}
}

public interface ATM {

	boolean deposit(Account account, double amount);

	boolean withdraw(Account account, double amount) throws Exception;

	double getBalance();

}

class AxisATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		if (amount > 0) {
			double currentBalance = account.getBalance();
			double finalBalance = currentBalance + amount;
			account.setBalance(finalBalance);
			return true;
		} else {
			throw new IllegalArgumentException("The amount is zero.");
		}
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 5000) {
			throw new IllegalArgumentException("Your balance is low.");
		} else {
			System.out.println("5 rupees for transaction.");
			double currentBalance = account.getBalance();
			account.setBalance(currentBalance - 5);
			return false;
		}
	}

	@Override
	public double getBalance() {
		return this.getBalance();
	}

}

class IciciATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		if (amount > 0) {
			double currentBalance = account.getBalance();
			double finalBalance = currentBalance + amount;
			account.setBalance(finalBalance);
			return true;
		} else {
			throw new IllegalArgumentException("The amount is zero.");
		}
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 10000) {
			throw new IllegalArgumentException("Your balance is low.");
		} else {
			System.out.println("10 rupees for transaction.");
			double currentBalance = account.getBalance();
			account.setBalance(currentBalance - 10);
			return false;
		}
	}

	@Override
	public double getBalance() {
		return this.getBalance();
	}
}