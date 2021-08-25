package oop.poly;
/*
 * 추상클래스
 * => 미완성된 클래스 즉, 모든 내용이 구현되어 있지 않은 클래스로, 완성되지 않았기 때문에 객체를 생성할 수 없다.
 * 					-----------------------
 * 					내용이 정의되지 않은 메소드를 갖고 있는 클래스
 * 						|_ 추상메소드(body가 없는 메소드)
 * 
 * 1) 추상메소드를 선언하는 방법
 * 		접근제어자 abstract 리턴타입 메소드명(매개변수list...);
 * 		=> 추상메소드를 정의하면 클래스도 추상클래스가 되므로 클래스 선언부에도 abstract를 추가해야된다.
 * 
 * 2) 추상클래스의 특징
 * 		-일반메소드와 추상메소드를 모두 정의할 수 있다.
 * 		- 추상메소드가 하나라도 정의되어 있으면 추상클래스이므로 abstract를 클래스 선언부에 추가해야 한다.
 * 		- 추상클래스는 객체생성을 할 수 없다.
 * 		- 추상클래스를 상속받는 클래스는 에러가 발생한다.
 * 
 * 		=> Sub가 Super를 상속하고 있고 상속을 받으면 Super클래스의 모든 멤버가 Sub클래스의 소유가 된다.
 * 			그러므로 Sub가 추상메소드를 갖고 있는 클래스가 되므로 추상클래스가 된다.
 * 
 * 		[해결방법]
 * 		1. 하위클래스에 선언부에 abstract을 추가해서 추상클래스로 정의한다.
 * 		2. 상속받은 abstract클래스의 abstract메소드를 오버라이딩해서 정의해주어야 한다.
 */
abstract class Super{
	public void test() {
		System.out.println("test()");
	}
	
	public abstract void display(); 
}

class Sub extends Super{
	public void display() {
		
	}
}
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Super obj = new Super();   -> 추상클래스이므로 객체 생성을 할 수가 없다.
	}

}
