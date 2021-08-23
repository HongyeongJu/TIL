package oop.inheritance;

public class Account {
	private String accId;
	private long balance;
	private String ownerName;
	
	public void setAccId(String accId) {
		this.accId = accId;
	}
	
	public String getAccId() {
		return accId;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public long getBalance() {
		return balance;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public Account() {
		
	}
	
	public Account(String accId, long balance, String ownerName) {
		setAccId(accId);
		setBalance(balance);
		setOwnerName(ownerName);
	}
	
	public void deposit(long amount) {
		this.balance += amount;
	}
	
	public void withdraw(long amount) {
		if(balance >= amount) {
			balance -= amount;
		}
	}
}
