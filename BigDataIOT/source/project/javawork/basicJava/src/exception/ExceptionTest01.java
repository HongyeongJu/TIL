package exception;

// 예외가 발생되는 프로그램
public class ExceptionTest01 {

	public static void main(String[] args) {
		System.out.println("*******프로그램시작*******");
		System.out.println(10/0);			// 예외가 발생할 수 있는 문장
		System.out.println("******처리중**********");
		System.out.println("******프로그램종료*********");
	}

}
