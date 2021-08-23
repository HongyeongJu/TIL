package oop.inheritance;

public class CheckingAccount extends Account{
	private String cardNo;
	
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	
	public void pay(String cardNo, long amount) {
		if(cardNo.equals(this.cardNo) && getBalance() >= amount) {
			setBalance(getBalance() - amount);
		}else {
			System.out.println(" 지불이 불가능합니다.");
		}
	}
}
