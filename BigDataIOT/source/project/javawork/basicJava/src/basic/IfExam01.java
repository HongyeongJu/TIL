package basic;

import java.util.Random;

public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� �߻���Ű�� 0, ����, ����� �Ǻ��ؼ� ����ϱ�
		
		Random ran = new Random();
		
		int num = ran.nextInt();
		if(num > 0) {
			System.out.println(num + "=>���");
		}else if(num <0) {
			System.out.println(num + "=>����");
		}else {
			System.out.println(num + "=>0");
		}
	}

}
