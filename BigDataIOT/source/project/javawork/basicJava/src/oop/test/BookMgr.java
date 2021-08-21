package oop.test;
public class BookMgr {
	
	private Book[] booklist;
	
	public BookMgr(Book[] booklist) {
		this.booklist = booklist;
	}
	
	public void printBooklist(){
		for(Book a : booklist) {
			System.out.println(a.getTitle());
		}
	}
	
	public void printTotalPrice(){
		int sum = 0;
		
		for(Book a : booklist) {
			sum += a.getPrice();
		}
		System.out.println("전체 책 가격의 합 : " + sum);
	}
}
