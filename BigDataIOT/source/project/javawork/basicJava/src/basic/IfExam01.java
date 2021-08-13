package basic;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 랜덤수를 발생시키고 0, 음수, 양수를 판별해서 출력하기
		/*
		 * Random ran = new Random();
		 * 
		 * int num = ran.nextInt();
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println(num + "=>양수");
		}else if(num <0) {
			System.out.println(num + "=>음수");
		}else {
			System.out.println(num + "=>0");
		}
	}

}
