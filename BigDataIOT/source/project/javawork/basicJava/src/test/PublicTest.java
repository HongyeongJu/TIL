package test;

import oop.basic.Person;
// jvm은 현재 작업 중인 패키지(test), java.lang 패키지만 기본으로 인식함.
// 따라서 그 외의 패키지에 작성된 클래스를 사용하기 위해서 import 해야됨.
public class PublicTest {

	public static void main(String[] args) {
		Person p = new Person();
		// p.name은 public으로 정의되었기 때문에 다른 패키지의 클래스에서 접근이 가능
		// addr변수는 default접근제한자 정의되었기 때문에 Person 클래스 정의된 oop.basic 패키지의 클래스에서만 접근이 가능
		System.out.println(p.name+"," +p.addr); 
	}

}
