package chap04;
public class TimeTest
{
	public static void main(String[] args){
		int time = 8000;
		int second = time % 60;

		time /= 60;
		int min = time % 60;
		int hour = time / 60;

		System.out.println(hour + " 시간 " + min + " 분 " + second + " 초" );
	}
}