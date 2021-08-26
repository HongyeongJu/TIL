package exception;

class BankCustomer{
	// 문제를 잘 읽고 구현하세요.
	String name;
	int currentMoney;
	public BankCustomer(String name, int currentMoney) {
		super();
		this.name = name;
		this.currentMoney = currentMoney;
	}
	public int getCurrentMoney() {
		return currentMoney;
	}
	public void withdraw(int i) throws IllegalArgumentException {
		/*
		 * currentMoney가 money보다 작으면 Illegal
		 */
		if(currentMoney < i) {
			throw new IllegalArgumentException("잔액이 부족합니다.");
		}
		currentMoney = currentMoney -i;
		
	}
}
public class Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("홍길동", 100);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

