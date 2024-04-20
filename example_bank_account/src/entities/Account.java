package entities;

public class Account {
	
	private String holder;
	private int number;
	private double balance;
	
	public static final double WITHDRAWAL_FEE = 5.00;
	
	public Account() {
		
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double deposit(double cash) {
		return balance += cash;
	}
	
	public double withdraw(double cash) {
		
		double withdrawValue = cash + WITHDRAWAL_FEE;
		
		return balance -= (withdrawValue);
	}
	
	public String String() {
		return "Account: " + number
				+ ", Holder: " + holder
				+ ", Balance: $ " + String.format("%.2f", getBalance());
	}
	
}
