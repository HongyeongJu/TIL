package basic;

import java.util.Random;

//if~else를 연습
public class IfTest01 {

	public static void main(String[] args) {
		
		//  num변수에 1부터 100까지의 랜덤수를 발생시키고 90 이상이면 합격 출력
		// 나머지는 재시험으로 출력하기
		
		Random ran = new Random();
		int score = ran.nextInt(100) + 1;
		if(score >= 90) {
			System.out.println("점수 : " + score + "(합격)");
		}else {
			System.out.println("점수 : " + score + "(재시험)");
		}
	}

}
