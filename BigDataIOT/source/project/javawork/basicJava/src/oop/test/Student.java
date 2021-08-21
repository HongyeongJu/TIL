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
			System.out.println("그런 과정명은 없습니다.");
		}
	}
	
	public void print() {
		System.out.println(name + "씨의 과정명은 " + subject + " 이고 교육비는 " + fee + " 이며 환급금은 " + returnFee + "입니다.");
	}

	public static void main(String args[]){
		Student stu = new Student("장동건", "jspprogram", 
				500000);
		stu.calcReturnFee();
		stu.print();
	}
}  
