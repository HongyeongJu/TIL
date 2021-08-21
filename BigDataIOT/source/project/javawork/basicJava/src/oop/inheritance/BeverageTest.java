package oop.inheritance;

public class BeverageTest {
	
	public static void main(String[] args) {
		
		Coffee coffe1 = new Coffee("커피", 2500, "아메리카노");
		Coffee coffe2 = new Coffee("커피", 2700, "카페라떼");
		Coffee coffe3 = new Coffee("커피", 3000, "카푸치노");
		
        coffe1.print();
        coffe2.print();
        coffe3.print();
	}

}


class Beverage{
	private String type;
	private int price;

	Beverage(String type, int price){
		this.type = type;
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}

class Coffee extends Beverage{
	private String name;
	
	Coffee(String type, int price, String name){
		super(type, price);
		this.name = name;
	}
	
	public void print() {
		System.out.println("타입 : " + super.getType() + " 이름 : " +  name  + " 가격 : " + super.getPrice());
	}
}