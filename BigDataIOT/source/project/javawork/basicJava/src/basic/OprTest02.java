package basic;
// 비교 연산자
public class OprTest02 
{
	public static void main(String[] args) 
	{
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		/*
		num1변수가  + 연산자 때문에 문자열이 되었기 때문에 오류발생
		+연산자는 더하기의 의미 말고 연결하는 기능을 처리
		+연산자 앞에 문자열이 있으면 뒤에 숫자가 있어도 문자열로 변환된다.
		비교연산, 사칙연산을 할 수 없다.
		*/
		System.out.println("더한결과==>" + (num1 + num2));
		System.out.println("num1> num2 ==>" + (num1 > num2));
		System.out.println("num1>= num2 ==>" + (num1 >= num2));
		System.out.println("num1< num2 ==>" + (num1 < num2));
		System.out.println("num1<= num2 ==>" + (num1 <= num2));
	}
}
