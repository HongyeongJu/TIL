// 논리연산자(short-circuit) - &&, ||
//			&, |의 차이는 조건식을 모두 검사하는지 skip하는지 차이

public class OprTest04
{
	public static void main(String[] args) 
	{
		int num1 = 120;
		// 자바는 인터프리터( 한줄씩 실행시키는 것) 이기때문에 오류가 발생하더라도 윗줄까지는 출력할 수가 있다.
		System.out.println("작업시작");
		String str = null;		// 현재 str에 아무것도 할당되지 않은 변수
		//str.length();			// nullPointer Exception!! <- 아무것도 참조가 되어있지 않아서 발생
		
		// | 연산자는 비교되는 2개의 항을 다 검사를 한다.
		//System.out.println(num1 > 100 | str.length() > 0);
		// || 연산자는 or연산의 특성을 파악하고 첫 번째 항이 true 연산자 뒤의 항은 검사하지 않는다.
		System.out.println(num1 > 100 || str.length() > 0);			// 첫번째 것 검사하고 true면 뒤에것을 아예 검사하지 않는다.

		// &&연산자는 and연산의 특성을 파악하고 첫 번째 항이 false 이면 뒤의 항은 검사하지 않는다.
		// &한개 짜리는 연산자 기준으로 왼쪽항 오른쪽항을 둘다 검사한다.
		//System.out.println(num1 <100 & str.length() > 0);
		System.out.println(num1 <100 && str.length()> 0);
	}
}
