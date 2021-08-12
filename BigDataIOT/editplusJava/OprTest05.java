// 삼항연산자, 대입연산자
public class OprTest05
{
	public static void main(String[] args) 
	{
		int num1 = 80;
		// 조건? 조건이 만족하는 경우 할당될 값 : 조건이 만족하지 않을때 항당될 값
		System.out.println(num1 >= 90 ? "합격": "불합격");
		int point = num1 >=90 ? 1000 :0;
		System.out.println(point);

		// 대입연산자
		int i = 0;
		i = i + 20;
		System.out.println("i=" + i);
		
		i+=30;
		System.out.println("i=" + i);

		i/=30;
		System.out.println("i="+ i);
	}
}
