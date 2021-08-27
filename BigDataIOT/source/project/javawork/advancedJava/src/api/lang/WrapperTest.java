package api.lang;

public class WrapperTest {

	public static void main(String[] args) {
		// 5.0 이전
		int i = 100;
		Integer obj = new Integer(i);
		run(obj);
		
		//5.0이후
		int num = 1000;
		//5.0 이후 버전의 jdk에서는 컴파일러가 자동으로 변환
		// 참조형매개변수에 기본형 데이터를 전달하는 경우
		// 컴파일러가 자동으로Integer 볁수 = new Integer(num) 와 같은 코드를 실행해서 전달해준다. - 오토박싱
		Integer obj2 = num;
		run(obj2);
		run(1000000); // wrapper타입에 대해서만 -자동으로 컴파일러가 1000000를 Integer객체로 변환 
		
	}
	
	public static void run(Object obj) {
		System.out.println(obj);
		
		
		//5.0 이전 - 매개변수로 전달받은 int값을 실제 기본형으로 변환
		// 매개변수로 전달받은 객체를 Integer로 변환하고 Integer의 메소드를 호출해서
		Integer in = (Integer)obj;
		int num = in.intValue();
		
		//5.0이후
		//오토언박싱
		//int형 변수에 참조형으로 변환된 값을 전달하는 경우 컴파일러가 자동으로 객체로 포장된 값을 풀러서 기본형으로 변환해준다.
		int i = (Integer)obj;
		
		System.out.println("5.0이전버전에서 변환=>"+num);

		System.out.println("5.0이후버전에서 변환=>"+i);
	}

}
