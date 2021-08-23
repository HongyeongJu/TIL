package oop.inheritance;

// 상위 클래스
final class SuperB{ // 상속이 불가능한 클래스
	// 멤버변수(지역변수)에 final을 추가하면 상수의 의미 - 값을 재할당 할 수 없다.
	// => 자바에서는 상수와 변수를 구분하기 위해 상수는 대문자로 정의하기로 약속
	final int NUM = 100;
	public final void display() {
		System.out.println("부모의 display()");
	}
}

// 상위 클래스가 final이 붙으면 상속이 불가
class SubB extends SuperB{
	public void test() {
		super.NUM = 1000;
		System.out.println(NUM);
	}
	
	// 재정의 불가
	public void display() {
		System.out.println("자식의 display()");
	}
}


public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubB obj = new SubB();
		obj.test();
	}

}
