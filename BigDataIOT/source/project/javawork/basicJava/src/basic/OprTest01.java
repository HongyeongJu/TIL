package basic;

public class OprTest01
{
	public static void main(String[] args){
		int x = 5;
		int y = x++;
		System.out.println("x : " + x + "y : " + y);
		x = 5;
		y = ++x;
		System.out.println("x : " + x + "y : " + y);
		x = 5;
		y = x--;
		System.out.println("x : " + x + "y : " + y);
		x = 5;
		y = --x;
		System.out.println("x : " + x + "y : " + y);
		

	}
}