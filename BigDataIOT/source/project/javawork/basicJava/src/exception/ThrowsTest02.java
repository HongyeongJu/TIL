package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;
// 다중 catch를 이용하는 것처럼 throws할때도 여러 개의 Exception을 넘기는 경우 ,로 구분해서 정의
public class ThrowsTest02 {
	
	public void test() throws ArithmeticException{
		System.out.println(10/0);
	}

	public void test2() throws ArithmeticException, FileNotFoundException{
		test();
		FileReader fr = new FileReader("test2.txt");
	}
	
	public void test3() throws ArithmeticException, FileNotFoundException , IOException{
		test2();
		Socket socker = new Socket("127.0.0.1", 12345);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
