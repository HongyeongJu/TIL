package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

//API���� �����Ǵ� Ŭ������ ����ϴ� ��� �߻��ϴ� ���� ó��
//FileNotFoundException, IOException�� ȣ���ϴ� ������ ���ܿ� ���� ó���� ���� ������ ���������� �߻��Ǿ� �������� ������� ����
// NumberFormatException�� ȣ���ϴ� ������ ���ܿ� ���� ó���� ���� �ʾƵ� ���������� �߻����� �ʴ´�.
//===> RuntimeException�� ���� Exception�� ����ó���� ���� �ʾƵ� ���������� �߻����� �ʴ´�. (unchecked ����)
//===> RuntimeException�� ���� Exception�� �ƴ� ��� ���ܿ� ���� ó���� �ݵ�� �ؾߵȴ�. (checked ����)
//===> ���������� ����ó���� �����ϰų� ���������ʰų� ��� ���ܿ� ���� ó���� �ؾ� �Ѵ�.

public class ExceptionTest05 {

	public static void main(String[] args) {

		char[] str = new char[100];
		// TODO Auto-generated method stub
		try {
			// FileReader �� FileNotFoundException�� throws�ϰ� �ִٴ� ���� ���ο��� ���ܸ� ���� ó������ �ʰ�
			//ȣ���ϴ� ������ ���ܸ� ó���϶�� �ǹ�
			FileReader fr = new FileReader("test.txt");
			System.out.println(fr.read(str));
			System.out.println(Integer.parseInt("100"));
			DriverManager.getConnection("");
		}catch (FileNotFoundException e) {
			System.out.println("�ش� ������ ã�� �� �����ϴ�.");
			//���ϸ��� Ʋ�� ��� ó���ؾ� �ϴ� �ڵ带 ���
		}catch(IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}catch(SQLException e) {
			System.out.println("Ŀ�ؼǽ���");
		}

	}

}
