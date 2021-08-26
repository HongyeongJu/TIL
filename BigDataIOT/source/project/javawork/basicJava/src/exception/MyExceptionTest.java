package exception;

import java.util.Scanner;

// 사용자가 홀수를 입력하면 예외를 발생시키기
public class MyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = key.nextInt();
		if(num % 2 == 1) {
			//JVM이 인식하지 못하는 예외상황 - 사용자가 만들어 놓은 예외를 인위적으로 발생시킨다.
			// 예외를 throw명령을 이용해서 발생시키면 그 문장 자체가 예외발생가능성이 있는 코드가 되므로 예외처리를 해야 한다.
			try {
				throw new MyException();
			}catch(MyException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
