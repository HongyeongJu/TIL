package oop.inheritance;

public class BeverageTest {
	
	public static void main(String[] args) {
		
		Coffee coffe1 = new Coffee("Ŀ��", 2500, "�Ƹ޸�ī��");
		Coffee coffe2 = new Coffee("Ŀ��", 2700, "ī���");
		Coffee coffe3 = new Coffee("Ŀ��", 3000, "īǪġ��");
		
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
		System.out.println("Ÿ�� : " + super.getType() + " �̸� : " +  name  + " ���� : " + super.getPrice());
	}
}