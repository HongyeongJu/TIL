package basic;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 성별코드 - 1~4까지
		// 2. 나이 -1~100까지
		// 성별과 나이를 가지고 판단해서 결과를 출력하기
		/*
		 * Random ran = new Random(); int gender_code = ran.nextInt(4) +1;
		 * 
		 * int age = ran.nextInt(100) + 1;
		 */
		Scanner scan = new Scanner(System.in);
		int gender_code = scan.nextInt();
		int age = scan.nextInt();
		
		if(gender_code == 1 || gender_code == 3) {
			if(age >= 20) {
				System.out.println("성인남자(" + age + "," + gender_code +")");
			}else {
				System.out.println("청소년남자(" + age + "," + gender_code +")");
			}
		}else if(gender_code == 2 || gender_code == 4) {
			if(age >= 20) {
				System.out.println("성인여자(" + age + "," + gender_code +")");
			}else {
				System.out.println("청소년여자(" + age + "," + gender_code +")");
			}
		}
	}

}
