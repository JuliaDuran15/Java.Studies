package entities;

public class Bank {
	private int num_account;
	private String name;
	private double balance;
	
	
	public Bank(int num_account, String name, double initialDeposit) {
		this.num_account = num_account;
		this.name = name;
		deposit(initialDeposit);
	}


	public Bank(int num_account, String name) {
		super();
		this.num_account = num_account;
		this.name = name;
	}


	public int getNum_account() {
		return num_account;
	}


	public void setNum_account(int num_account) {
		this.num_account = num_account;
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


	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdraw(double balance) {
		this.balance -= balance -5;
	}
	public String toString() {
		return "Account "
				+ num_account
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
}
}