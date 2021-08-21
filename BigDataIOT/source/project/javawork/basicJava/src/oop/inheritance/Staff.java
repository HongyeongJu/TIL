package oop.inheritance;

public class Staff extends Person{
	private String dept;
	
	public Staff(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		super.print();
		System.out.println(" ºÎ¼­ : " + dept);
	}
}
