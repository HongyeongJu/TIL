package api.lang;

public class Vehicle {

	private Owner owner;
	private int price;
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((Vehicle)obj).getOwner() == owner;
	}
	@Override
	public String toString() {
		String str = "소유주정보 : " + owner.toString() + "\n" +"차량정보 : 가격은 " + price + "입니다."; 
		return str;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
