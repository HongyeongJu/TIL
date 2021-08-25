package exception;

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("start");
		System.out.println("숫자를 입력하세요");
		int num = key.nextInt();
		System.out.println("나눌 숫자를 입력하세요");
		int num2 = key.nextInt();
		System.out.println("결과: " + (num / num2));
		System.out.println("다른 작업의 처리");
		System.out.println("end");
	}

}
