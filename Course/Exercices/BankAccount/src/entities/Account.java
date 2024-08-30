package entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	
	public Account(int accountNumber, String accountHolder, double balance) {
		
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
		
	}

	public Account(int accountNumber, String accountHolder) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}


	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;	
	}
	
	public void withdraw(double value) {
		balance -= value;
		balance -= 5;
	}
	
}
