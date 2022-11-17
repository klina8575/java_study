package test.ch06.question;

public class Account {
	private int balance; //잔고
	public static final int MIN_BALANCE = 0; 
	public static final int MAX_BALANCE = 1000000;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	} 
	
}
