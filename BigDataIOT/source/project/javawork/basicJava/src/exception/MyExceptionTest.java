package exception;

import java.util.Scanner;

// ����ڰ� Ȧ���� �Է��ϸ� ���ܸ� �߻���Ű��
public class MyExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		int num = key.nextInt();
		if(num % 2 == 1) {
			//JVM�� �ν����� ���ϴ� ���ܻ�Ȳ - ����ڰ� ����� ���� ���ܸ� ���������� �߻���Ų��.
			// ���ܸ� throw����� �̿��ؼ� �߻���Ű�� �� ���� ��ü�� ���ܹ߻����ɼ��� �ִ� �ڵ尡 �ǹǷ� ����ó���� �ؾ� �Ѵ�.
			try {
				throw new MyException();
			}catch(MyException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
