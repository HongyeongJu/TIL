package exam;

import java.util.Scanner;

public class Logic14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if( num % 4 == 0 ) {
			if((num % 400 != 0 && num% 100 == 0)) {
				System.out.println(num + "�� 2���� ������ 28�� �Դϴ�.");
			}else {
				System.out.println(num + "�� 2���� ������ 29�� �Դϴ�.");
			}
			
		}else {
			System.out.println(num + "�� 2���� ������ 28�� �Դϴ�.");
		}

	}

}
