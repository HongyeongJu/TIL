package basic;
// 논리연산자
// - and , or, not
public class OprTest03
{
	public static void main(String[] args) 
	{
		int age = 15;
		int gender = 1;

		int num1 = 100;
		int num2 = 200;
		// & 연산자
		System.out.println("==========&연산========");
		// true & true
		System.out.println((num1<num2) & (num1 >= 100));
		// true & false
		System.out.println((num1<num2) & (num1 > 100));
		// false & true
		System.out.println((num1>num2) & (num1 >= 100));
		// false & false
		System.out.println((num1>num2) & (num1 > 100));

		
		// | 연산자(or)
		System.out.println("==========|연산========");
		// true & true
		System.out.println((num1<num2) | (num1 >= 100));
		// true & false
		System.out.println((num1<num2) | (num1 > 100));
		// false & true
		System.out.println((num1>num2) | (num1 >= 100));
		// false & false
		System.out.println((num1>num2) | (num1 > 100));


		System.out.println();		//Enter키를 누른 것과 같은 결과
		//!(not)
		System.out.println(!true);
		System.out.println(!false);

	}
}
