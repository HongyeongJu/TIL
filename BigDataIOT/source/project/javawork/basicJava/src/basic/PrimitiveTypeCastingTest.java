package basic;

public class PrimitiveTypeCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자동형 변환
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		
		char c = 'A';
		int data = c;
		// char가 int로 자동캐스팅이 가능한 이유는 char에 각각 ASCII라는 코드값이 정의되어 있기 때문에 가능
		// 키보드의 각 키는 내부적으로 사용할 수 있는 숫자값을 가지고 있다. (ASCII코드)
		System.out.println(l);
		System.out.println(d);
		System.out.println(c);
		System.out.println(data);
		
		// 2.명시적형변환 - 직접 타입을 변경
		byte bdata = (byte)200;
		System.out.println(bdata);
		// ASCII코드를 문자로 변환해야 하는 경우
		int idata = 65;			// ascii코드
		char cdata = (char)idata;		// 문자로변환
		System.out.println(cdata);
		System.out.println((char)100);
		
		double result = (double)10/3;
		System.out.println(result);
		
		double result2 = (double)20 /100 * 100;
		System.out.println(result2);
	}

}
