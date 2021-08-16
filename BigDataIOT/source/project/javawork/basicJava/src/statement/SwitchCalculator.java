package statement;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("******미니계산기******");
			System.out.println("1.더하기");
			System.out.println("2.곱하기");
			System.out.println("3.빼기");
			System.out.println("4.나누기");
			System.out.println("5.종료");

			System.out.print("연산자를 선택하세요.");
			int choice = scan.nextInt();
			
			if(choice == 5) break;

			System.out.print("숫자를 입력하세요.");
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
				System.out.println("다른걸 선택해주세요.");
			}
			if(isPossible) {

				System.out.println("계산결과=>" + result);
			}else {
				System.out.println("계산불가");
			}
		}
		
	}


}
