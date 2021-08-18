package oop.basic;

public class Teacher {
	private String name;
	private int age;
	private String subject;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		System.out.println("이름 :" + name + " 나이: " + age + " 담당과목 : "+  subject);
	}
}
