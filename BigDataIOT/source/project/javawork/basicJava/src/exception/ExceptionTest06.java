package exception;

import java.io.FileReader;

// throws는 메소드를 호출하는 곳에서 예외를 처리하도록 설정
// 자바인터프리터에서 예외에 대한 처리를 하도록 넘기기(예외를 던진다.)

public class ExceptionTest06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("test.txt");	
	}

}
