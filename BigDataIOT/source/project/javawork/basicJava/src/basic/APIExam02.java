package basic;

import java.util.Random;

public class APIExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		System.out.println("랜덤수: " + rand.nextInt());
		
		// 1부터 100까지 랜덤수를 출력
		
		System.out.println("랜덤수 : " + (rand.nextInt(100) +1));
	}

}
