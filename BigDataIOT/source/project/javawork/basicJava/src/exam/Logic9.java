package exam;

import java.util.Scanner;

public class Logic9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���. : ");
		int num = scan.nextInt();
		
		for(int i = num ; i >= 0 ;i--) {
			for(int j = 0; j < i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
