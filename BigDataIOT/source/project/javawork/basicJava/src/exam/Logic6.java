package exam;

import java.util.Scanner;

public class Logic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("양의 정수를 입력하세요.:");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int count = 0;
		int sum = 0;
		for(int i = num ; i<= 1000 ; i = i + num) {
			count++;
			sum+= i;
		}
		
		System.out.println("7의 배수 개수 = " + count);
		System.out.println("7의 배수 합 = " + sum);
	}

}
