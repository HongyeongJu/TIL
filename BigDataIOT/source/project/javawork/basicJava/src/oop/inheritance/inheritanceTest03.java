package oop.inheritance;
/*
 * <<상속관계에서 생성자의 특징>>
 * 1. 모든 클래스의 생성자메소드의 첫 번째 문장은 부모클래스의 기본생성자를 호출하는 명령문이 생략되어 있다.
 * 		=> 부모클래스의 생성자를 호출하는 방법은 super(매개변수)
 * 			super()는 부모클래스의 기본생성자를 의미
 * 			super(매개변수 list.....)는 부모 클래스의 매개변수 있는 클래스 호출하는 경우
 * 2. 모든 클래스의 최상위 클래스는 java.lang.object클래스이다.
 * 		=> 다른 클래스를 상속하고 있지 않는 클래스는 모두 Object클래스를 상속하는 명령문이 생략되어 있다.
 * 		=> 자바에서 사용되는 객체가 갖는 공통의 특징이 정의된 클래스가 java.lang.Object 클래스
 * 			자바에서는 이 클래스를 최상위클래스로 정의될 수 있도록 자바의 컴파일러가 자동으로 추가된다.
 * 		=> 자바객체가 JVM에서 실행될 때 갖는 모든 공통의 특징을 java.lang패키지의 Object에 정의해 놓고
 * 			컴파일러를 통해 자동으로 상속받도록 한다.
 * 3. 부모클래스에 정의되어 있는 매개변수가 있는 생성자를 호출할 수 있다.
 * 	  super(매개변수1, 매개변수2 ...)
 */

class SuperA /*extends Object*/{
	private String name;
	public SuperA() {
		super();
	}
	public SuperA(String name) {
		//super();		// 이클립스의 자동완성기능으로 생성자를 추가하면super()가 추가
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

class SubA extends SuperA{
	int age;
	String addr;
									// 1. SubA에는 기본생성자가 생략되어 있다.
	public SubA(String name) {		// 2. 모든 생성자의 첫 번째 문장에는 부모의 기본생성자 호출문이 생략되어 있다.
		super(name);				// 3. 부모클래스에서는 매개변수가 있는 생성자가 이미 정의되어 있으므로 컴파일러가 기본생성자를 추가해주지 않는다.
									// => 부모의 기본생성자를 호출하는데 부모클래스에는 기본생성자가 없으므로 오류가 발생
									// => [해결방법]
									// - 부모 클래스에 기본 생성자를 추가한다.
									// - 부모 클래스에 정의된 생성자를 호출하도록 변경한다.
		
	}
	
	SubA(String name, int age, String addr){		// SubA가 name을 갖고 있지 않아도 name변수를 전달받을 수 있도록 추가해야 한다.
		super(name);			// 부모에 정의되어 있는 String매개변수 한 개를 받는 생성자를 찾아서 호출한다.
								// => 이런 경우 부모의 기본생성자 호출문을 대신
		this.age = age;
		this.addr = addr;
	}
	
	public void display() {
		System.out.println("name = " +getName() + ", age = " + age + " ,addr = " + addr);
	}
	
}

public class inheritanceTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA obj = new SubA("dd"); 
		// 상속관계가 있는 클래스를 사용하는 경우 실제 사용하는 곳에서는 하위클래스를 생성해서 사용한다.
		// 직접 사용하는 클래스가 하위클래스라고 하더라도 값은 상위클래스에 존재하는 경우도 있다.
		// 따라서 하위클래스를 사용하는 경우 하위클래스가 직접적으로 맴버변수를 갖지 않다고 하더라도 모든 값을 하위클래스에서 받을 수 있도록 생성자를 정의해야됨.
		SubA obj2 = new SubA("장동건",20, "인천");
		obj.display();		// obj객체 맴버의 변수 값이 아무것도 셋팅되어 있지 않으므로 모두 결과가 값이 출력되지 않는다.
		obj2.display();		// name이 null로 출력
	}

}
