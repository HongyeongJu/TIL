package exam;

import java.util.Scanner;

public class Logic3 {

	static int DFS(int a) {
		if(a == 1) return 1;
		
		return a * DFS(a-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���");
		int num = scan.nextInt();

		if(num < 1 || num > 9) {
			System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}
		else {
			for(int i = 1; i <= num ;i++) {
				System.out.println(i +"!"+ "="+DFS(i));
			}
		}
		
	}

}
