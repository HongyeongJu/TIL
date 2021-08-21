package oop.test;
public class Student {
	
	
	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	
	Student(String name, String subject, int fee){
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	
	public void calcReturnFee() {
		if(subject == "javaprogram") {
			returnFee = ((double)fee) / 4;
		}else if(subject == "jspprogram") {
			returnFee = ((double)fee) / 5;
		}else {
			System.out.println("�׷� �������� �����ϴ�.");
		}
	}
	
	public void print() {
		System.out.println(name + "���� �������� " + subject + " �̰� ������� " + fee + " �̸� ȯ�ޱ��� " + returnFee + "�Դϴ�.");
	}

	public static void main(String args[]){
		Student stu = new Student("�嵿��", "jspprogram", 
				500000);
		stu.calcReturnFee();
		stu.print();
	}
}  
