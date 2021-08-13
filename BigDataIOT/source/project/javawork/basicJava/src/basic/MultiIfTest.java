package basic;

import java.util.Scanner;

public class MultiIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("주민번호 입력:");
		int ssn = key.nextInt();
		System.out.println(ssn);
		if(ssn == 1 | ssn ==3) {
			System.out.println("남자");
		}else if(ssn == 2 | ssn ==4) {
			System.out.println("여자");
		}else {
			System.out.println("기타");
		}
	}

}
