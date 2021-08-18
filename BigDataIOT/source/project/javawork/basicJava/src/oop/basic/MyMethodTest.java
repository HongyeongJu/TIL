package oop.basic;

//MyMethod클래스에 정의된 메소드를 호출
public class MyMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMethod m = new MyMethod();
		
		// 1. 메소드의 호출 - 매개변수가 없고 리턴값이 없는 메소드의 호출
		m.display();
		
		m.display("Aaa");
		
		m.display("dd", 2);
		
		// 3. 매개변수가 있고 리턴값이 있는 메소드를 호출
		// => 전달되는 리턴값을 사용하지 않아서 변화가 없다.
		// 리턴값이 있는 메소드를 호출하는 경우 리턴타입과 같은 변수를 선언하고 전다로디는 값이 할당되도록 한다.
		
		int result = m.add(100, 200);
		
		System.out.println("add메소드 호출결과=>" +result);
		
		if(result > 100) {
			System.out.println("크다.");
		}else {
			System.out.println("작다.");
		}
		
		// 2) 다른 메소드의 매개변수로 메소드의 리턴값을 바로 전달 할 수 있다.
		System.out.println(m.add(300, 500));
		
	}

}
