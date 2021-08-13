package basic;

import java.util.Scanner;
// switch문을 테스트 - MultiIfTest.java를 switch로 변환하기
public class SwitchTest01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("주민번호입력:");
		int ssn = key.nextInt();
		
		switch(ssn) {
		case 1:
			System.out.println("남자");
			break;
		case 2:
			System.out.println("여자");
			break;
		case 3:
			System.out.println("남자");
			break;
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("기타");
		}
	}

}
