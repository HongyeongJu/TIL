package basic;

// 기본형변수에 저장되는 리터럴
public class PrimitiveTypeValueTest {

	public static void main(String[] args) {
		boolean boolVal = true;// false;
		System.out.println(boolVal);
		
		// 정수형리터럴 - byte, short, int, long(정수형리터럴의 기본타입은 int)
		// 1)byte - 할당되는메모리 크기 : 1byte, 데이터표현범위 -128 ~127
		// byte b = 100;
		// 	   ---  ----
		//		변수 리터럴
		//		byte int
		byte b = 100;
		System.out.println("byte변수: "+ b );
		
		// 2)short - 2byte, -32768 ~ 32767
		short s = 32767;
		System.out.println("short변수: "+ s);
		
		// 3) int - 4byte,
		int i = 2147483647;
		System.out.println("int변수 : " + i);
		
		// 4) long - 8byte, 9223372036854775807
		// long타입의 리터럴은 접미사를 추가한다. L, l
		long l = 2147483648L;
		System.out.println(Long.MAX_VALUE);
		
		
		// 실수형 - float, double 소수자리를 표현하기 위한 타입(실수형리터럴의 기본타입은 double)
		// 1) float - 4byte
		// 실수형 리터럴은 기본값이 double 타입이므로 접미사를 추가한다. F,f
		float f = 10.5f;
		System.out.println("float형 변수 : " + f);
		
		// 2) double - 8byte
		double d = 10.5;
		System.out.println("double형 변수 : " + d);
		
		// char형 변수의 리터럴 - ''
		char c = 'A';
		System.out.println("char형변수 : " + c);
		
		// String 형변수의 리터럴 - String 은 참조형이지만 자주사용되므로 기본형처럼 사용할 수 있다.
		String str= "참조형인String의 리터럴은 큰따옴표로 표현";
		System.out.println(str);
	}

}
