package statement;

import java.util.Scanner;
// switch문을 테스트 - switch문의 특성을 활용해서 코드를 간략하게
public class SwitchTest02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.print("주민번호입력:");
		int ssn = key.nextInt();
		
		switch(ssn) {
		case 1:
		case 3:
			System.out.println("남자");
			break;
		case 2:
		case 4:
			System.out.println("여자");
			break;
		default:
			System.out.println("기타");
		}
	}

}
