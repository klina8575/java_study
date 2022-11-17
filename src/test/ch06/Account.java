package test.ch06;

public class Account {
	private String accNum;
	private String accOwner;
	private int accMoney;
	public Account(String accNum, String accOwner, int accMoney) {
		this.accNum = accNum;
		this.accOwner = accOwner;
		this.accMoney = accMoney;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getAccOwner() {
		return accOwner;
	}
	public void setAccOwner(String accOwner) {
		this.accOwner = accOwner;
	}
	public int getAccMoney() {
		return accMoney;
	}
	public void setAccMoney(int accMoney) {
		this.accMoney = accMoney;
	}
}
