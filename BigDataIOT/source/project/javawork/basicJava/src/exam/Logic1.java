package exam;

import java.util.Scanner;

public class Logic1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ��� :");
		int num = scan.nextInt();
		
		if(num <2 || num > 9) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}else {
			for(int i = 1 ; i <= 9 ; i++) {
				System.out.println(num + "*" + i +"=" + (num * i));
			}
		}

	}

}
