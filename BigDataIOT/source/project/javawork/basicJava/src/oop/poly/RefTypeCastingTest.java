package oop.poly;
// 객체의 형변환 - 상속관계에 있는 클래스인 경우에만 형변환이 가능하다.

import java.util.Random;

class Parent{
	String name = "장돈건";
	public void display() {
		System.out.println("super의 display");
	}
}

class Child extends Parent{
	String name ="장기용";
	public void display() {
		System.out.println("sub의 display");
	}
	
	public void show() {
		System.out.println("show");
	}
}

public class RefTypeCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Super타입의 참조변수로 Super객체를 액세스   ---------O");
		Parent obj1 = new Parent();
		obj1.display();
		System.out.println(obj1.name);
		System.out.println("*******************************");
		
		

		System.out.println("2. Sub타입의 참조변수로 Sub객체를 액세스 -------- O");
		Child obj2 = new Child();
		obj2.display();
		System.out.println(obj2.name);
		System.out.println("*******************************");
		
		/*
		 * 객체의 형변환
		 * Sub객체는 자동으로 Super타입으로 변환
		 * => 참조형의 형변환은 상속관계에 있는 경우 상위타입의 변수가 하위객체를 참조하는 경우 자동으로 형변환이 일어남.
		 * 		부모타입 변수 = new 자식객체();
		 * 
		 * 		1) 오버라이딩된 메소드가 있는 경우는 무조건 오버라이딩된 메소드가 실행된다.
		 * 		2) 변수를 통해서 액세스할 수 있는 멤버는 변수의 타입으로 제한
		 * 			변수가 부모타입이면 부모의 멤버만 접근할 수 있다.
		 * 		3) 변수가 부모타입이라고 하더라도 실제 참조하는 객체가 자식타입이면
		 * 			변수를 자식타입으로 캐스팅해서 접근할 수 있다.
		 */
		System.out.println("3. Super타입의 참조변수로 Sub객체를 액세스 --------- O");
		Parent obj3 = new Child();
		obj3.display();
		//obj3.show();			=> 오류 발생 Why?? Obj3은 Parent타입이므로 Parent의 멤버만 액세스할 수 있다.
								// 그러나 ...실제 Parent타입의 변수가 참조하는 객체가 Child타입이므로 형변환을 하면 Child객체의 멤버도 접근이 가능
		
		// ojb3을 Child타입으로 캐스팅
		((Child)obj3).show();
		System.out.println(obj3.name);
		System.out.println("*******************************");
		
		

		
		System.out.println("4. Sub타입의 참조변수로 Super객체를 액세스 --------- X");
//		Child obj4 = new Parent();
//		obj4.display();
//		System.out.println(obj4.name);
		System.out.println("************************************************");
		
		

		// 런타임 에러 발생 (ClassCastException)
		// 명시적으로 캐스팅을 해서 컴파일러는 속일 수 있으나 (단, 상속관계에 있는 경우만 가능)
		// obj1이 참조하는 객체가 Parent객체이므로 Child 정보가 없어서 캐스팅이 불가능하다.
		
		// 전혀 상관없는 클래스들은 캐스팅조차 할 수 없다.
		// -----------------
		// 		상속관계가 아닌
		//String str = new String("java");
		//Random rand = new Random();
		//String str2 = (String)rand;
		
		/*
		 * System.out.println("5. Sub타입의 참조변수 = Super객체 참조하는 Super타입의 변수 --------- x");
		 * Child obj5 = (Child)obj1; obj5.display(); //obj5.show();
		 * System.out.println(obj5.name);
		 * System.out.println("************************************************");
		 */
		
		
		System.out.println("6. Sub타입의 참조변수 =  Sub객체를 참조하는 Super타입의 변수 --------- ???");
		Child obj6 = (Child)obj3;
		obj6.display();
		System.out.println(obj6.name);
		System.out.println("************************************************");
	
	}

}
