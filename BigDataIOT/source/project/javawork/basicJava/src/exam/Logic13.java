package exam;

import java.util.Scanner;

public class Logic13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ʱⰪ�� ������ �Է��ϼ���.:");
		int num = scan.nextInt();
		System.out.print("���� ������ �Է��ϼ���.:");
		int num2 = scan.nextInt();

		System.out.print("�������� ������ �Է��ϼ���.:");		
		int increase = scan.nextInt();
		
		int sum = 0;
		for(int i = num ; i <= num2 ; i = i + increase) {
			sum += i;
		}
		if(sum > 1000) {
			sum += 2000;
		}
		System.out.println(sum);
	}

}
