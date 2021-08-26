package api.lang;

import java.util.Date;

public class ObjectTest01 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.getClass());
		System.out.println(obj1.hashCode());
		
		//객체의 기본메소드는 toString()
		//public String toString()
		//기본메소드는 생략이 가능하다. - 참조변수만 전달해도 참조변수.toString()을 의미
		
		System.out.println(obj1.toString());
		System.out.println(obj1);
		
		Person p = new Person("장동건",50, "서울");
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println("성명:" + p.getName() + ",나이:"+p.getAge() + ", 주소: "+p.getAddr());
		
		String str = new String("java");
		System.out.println(str);
		System.out.println(str.toString());
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());

	}

}
