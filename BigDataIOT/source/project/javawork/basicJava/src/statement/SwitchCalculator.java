package statement;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("******�̴ϰ���******");
			System.out.println("1.���ϱ�");
			System.out.println("2.���ϱ�");
			System.out.println("3.����");
			System.out.println("4.������");
			System.out.println("5.����");

			System.out.print("�����ڸ� �����ϼ���.");
			int choice = scan.nextInt();
			
			if(choice == 5) break;

			System.out.print("���ڸ� �Է��ϼ���.");
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int result = 0;
			boolean isPossible = true;
			switch(choice) {
			case 1:
				result = a +b;
				break;
			case 2:
				result = a * b;
				break;
			case 3: 
				result = a - b;
				break;
			case 4:
				if(b == 0) {
					isPossible = false;
					break;
				}else {
					result = a/ b;
					break;
				}

			default : 
				System.out.println("�ٸ��� �������ּ���.");
			}
			if(isPossible) {

				System.out.println("�����=>" + result);
			}else {
				System.out.println("���Ұ�");
			}
		}
		
	}


}
