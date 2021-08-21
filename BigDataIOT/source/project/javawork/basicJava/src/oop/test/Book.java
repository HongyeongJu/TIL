package oop.test;
public class Book {
	private String title;
	private int price;
	
	public Book() {
		title = "";
		price = 0;
	}
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}

}
