package oop.basic;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		p1.name = "장동건";
		p1.age = 40;
		p1.addr = "서울시";
		System.out.println("성명 : " + p1.name + "나이 :"  +p1.age + ", 주소 : " +p1.addr);
		
		Person p2 = new Person();
		p2.name = "김서연";
		p2.age = 25;
		p2.addr = "인천시";
		System.out.println("성명 : " + p2.name + "나이 :"  +p2.age + ", 주소 : " +p2.addr);
			
		

	}

}
