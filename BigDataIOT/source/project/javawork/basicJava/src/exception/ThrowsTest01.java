package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

//throws를 이용해서 예외처리를 호출하는 곳으로 넘기기
public class ThrowsTest01 {

	// 1. 예외가 발생하는 곳에서 직접 처리하기
	public void test(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
		}catch(FileNotFoundException e) {
			System.out.println("예외처리 완료 ...");
		}
	}
	// 2. 예외가 발생한 곳에서 처리하지 않고 호출한 곳에서 처리
	//								---------
	//								throws FileNotFoundException
	
	public void test2(String fileName) throws FileNotFoundException{
		FileReader fr = new FileReader(fileName);
	}
	
	//==> 예외가 발행하는 곳에서 처리하지 않고 호출하는 곳에서 예외를 처리할 수 있도록 구현
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		// 1. 예외가 미리 처리된 메소드를 호출
		// test 메소드를 호출하는 곳에서는 예외가 발생했는지 알 수 없다.
		// 예외에 대한 처리가 모두 동일
		obj.test("test1.txt");		// A위치에서 메소드를 호출했다고 가정
		obj.test("test2.txt"); 		// B위치에서 메소드를 호출했다고 가정
		
		// 2. 예외가 발생하는 코드 내부에서 예외를 처리하지 않고 호출하는 곳에서 예외를 처리하면 다양하게 원하는 방법대로 예외를 처리할 수 있다.
		//  => throws를 사용하는 것은 예외를 어느 곳에서 처리해야 하는지
		// 		결정하는 것이므로 예외가 발생하는 곳, 혹은 예외 발생하는 메소드를 호출하는곳 둘 중 한 곳에서는 반드시 try~catch로 처리해야한다.
		try {
			obj.test2("text1.txt");
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을 수 없습니다. 파일 선택 대화상자를 실행해서 파일을 직접 선택하도록 처리--->A방법");
		}
		
		try {
			obj.test2("test2.txt");
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다. 무조건 default로 설정한 파일이 실행되도록 처리--->B 방법");
		}
	}
}
