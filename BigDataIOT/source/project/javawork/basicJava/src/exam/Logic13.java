package exam;

import java.util.Scanner;

public class Logic13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		System.out.print("초기값을 정수로 입력하세요.:");
		int num = scan.nextInt();
		System.out.print("값을 정수로 입력하세요.:");
		int num2 = scan.nextInt();

		System.out.print("증가분을 정수로 입력하세요.:");		
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
