package oop.basic;

public class PersonMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonMethod p1 = new PersonMethod();
		p1.setName("장동건");
		p1.setAge(40);
		p1.setAddr("서울시");
		System.out.println("성명 : " + p1.getName() + "나이 :"  + p1.getAge() + ", 주소 : " +p1.getAddr());
		System.out.println("Person객체가 할당된 heap의 주소"+ p1);
		
		PersonMethod p2 = new PersonMethod();
		p2.setName("김서연");
		p2.setAge(25);
		p2.setAddr("인천시");
		System.out.println("성명 : " + p2.getName() + "나이 :"  +p2.getAge() + ", 주소 : " +p2.getAddr());
		System.out.println("Person객체가 할당된 heap의 주소"+ p2);	
		

	}

}
