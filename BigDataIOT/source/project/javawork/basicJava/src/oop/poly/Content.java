package oop.poly;

public abstract class Content {
	private String title;
	private int price;
	
	public Content(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public abstract void totalPrice();
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void show() {
		System.out.println(title + " 비디오의 가격은 " + price + "원 입니다.");
	}
}
