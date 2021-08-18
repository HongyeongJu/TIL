package oop.basic;

public class Student {
	private String name;
	private int age;
	private int id;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		System.out.println("이름 :" + name + " 나이: " + age + " 학 번 : "+  id);
	}
}
