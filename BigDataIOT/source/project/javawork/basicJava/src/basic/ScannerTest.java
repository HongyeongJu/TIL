package basic;

import java.util.Scanner;

// Scanner Ŭ������ �⺻ ����� => ���� �Է��� ���� �����͸� �� 
// ==> ǥ���Է����� �Էµ� ���� �о �����ϴ� ����� �������ִ� API�� Ŭ����
// Ű����� �Է�	   :System.in
// ǥ�� ��� - ȭ����� :System.out
public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key =new Scanner(System.in);
		// ��ü ������ �о ����
		String line = key.nextLine();
		System.out.println("����ڰ� �Է��� ���� =>" + line);
		// �ܾ��б�
		// => spacebar�� enterŰ�� �ԷµǱ� ������ �Է��� �ܾ �о ���� 
		String data = key.next();
		System.out.println("�Է¹��� �ܾ� =>" + data);
		
		//���� �б�
		int num = key.nextInt();
		System.out.println("�Է¹��� ����=>" +num);
		//�Ǽ� �б�
		double doubleVal = key.nextDouble();
		System.out.println("�Է¹��� �Ǽ�=>" +doubleVal);
		
	}

}
