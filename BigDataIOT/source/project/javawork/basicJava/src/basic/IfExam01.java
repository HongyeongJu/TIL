package basic;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� �߻���Ű�� 0, ����, ����� �Ǻ��ؼ� ����ϱ�
		/*
		 * Random ran = new Random();
		 * 
		 * int num = ran.nextInt();
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		if(num > 0) {
			System.out.println(num + "=>���");
		}else if(num <0) {
			System.out.println(num + "=>����");
		}else {
			System.out.println(num + "=>0");
		}
	}

}
