package exam;

import java.util.Scanner;

public class Logic11 {
	
	public static int abs(int num) {
		return num > 0 ? num : -num;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int num2 = scan.nextInt();
		
		System.out.println(abs(num- num2));

	}

}
