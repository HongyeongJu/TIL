package basic;

import java.util.Random;

//if~else�� ����
public class IfTest01 {

	public static void main(String[] args) {
		
		//  num������ 1���� 100������ �������� �߻���Ű�� 90 �̻��̸� �հ� ���
		// �������� ��������� ����ϱ�
		
		Random ran = new Random();
		int score = ran.nextInt(100) + 1;
		if(score >= 90) {
			System.out.println("���� : " + score + "(�հ�)");
		}else {
			System.out.println("���� : " + score + "(�����)");
		}
	}

}
