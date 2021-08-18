package oop.basic;

public class Staff {
	private String name;
	private int age;
	private String dept;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		System.out.println("이름 :" + name + " 나이: " + age + " 부 서 : "+  dept);
	}
}
