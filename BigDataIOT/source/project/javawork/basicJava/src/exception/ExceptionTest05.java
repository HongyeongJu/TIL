package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

//API에서 제공되는 클래스를 사용하는 경우 발생하는 예외 처리
//FileNotFoundException, IOException은 호출하는 곳에서 예외에 대한 처리를 하지 않으면 문법오류가 발생되어 컴파일이 진행되지 않음
// NumberFormatException은 호출하는 곳에서 예외에 대한 처리를 하지 않아도 문법오류가 발생되지 않는다.
//===> RuntimeException의 하위 Exception은 예외처리를 하지 않아도 문법오류가 발생하지 않는다. (unchecked 예외)
//===> RuntimeException의 하위 Exception이 아닌 경우 예외에 대한 처리를 반드시 해야된다. (checked 예외)
//===> 문법적으로 예외처리를 강요하거나 강요하지않거나 모두 예외에 대한 처리를 해야 한다.

public class ExceptionTest05 {

	public static void main(String[] args) {

		char[] str = new char[100];
		// TODO Auto-generated method stub
		try {
			// FileReader 가 FileNotFoundException을 throws하고 있다는 것은 내부에서 예외를 직접 처리하지 않고
			//호출하는 곳에서 예외를 처리하라는 의미
			FileReader fr = new FileReader("test.txt");
			System.out.println(fr.read(str));
			System.out.println(Integer.parseInt("100"));
			DriverManager.getConnection("");
		}catch (FileNotFoundException e) {
			System.out.println("해당 파일을 찾을 수 없습니다.");
			//파일명이 틀린 경우 처리해야 하는 코드를 명시
		}catch(IOException e) {
			System.out.println("파일을 읽을 수 없습니다.");
		}catch(SQLException e) {
			System.out.println("커넥션실패");
		}

	}

}
