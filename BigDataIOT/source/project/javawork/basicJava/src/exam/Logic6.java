package exam;

import java.util.Scanner;

public class Logic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� ������ �Է��ϼ���.:");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int count = 0;
		int sum = 0;
		for(int i = num ; i<= 1000 ; i = i + num) {
			count++;
			sum+= i;
		}
		
		System.out.println("7�� ��� ���� = " + count);
		System.out.println("7�� ��� �� = " + sum);
	}

}
