package basic;

public class APITest02 {

	public static void main(String[] args) {
		String str= new String("java");
		
		// String 클래스에 정의되어 있는 charAt 메소드를 사용
		//1. String클래스의 charAt 메소드는 매개변수가 1개이고 매개변수의 타입이 int이므로 
		//charAt을 사용하기 위해서 ()안에 정수 int형 숫자를 정의한다.
		// 2. charAt의 실행 결과가 char 타입이므로 실행 결과를 내 프로그램 안에서 활용하기 위해서 char 타입의 변수를 선언해서 결과를 저장
		char result = str.charAt(3);
		System.out.println("3번 위치의 문자는=>" + result);
	}

}
