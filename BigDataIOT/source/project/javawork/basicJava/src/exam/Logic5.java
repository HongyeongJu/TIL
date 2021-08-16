package exam;

import java.util.Scanner;

public class Logic5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		while(true) {
			String str = scan.nextLine();
			
			String[] strs = str.split(",");
			
			int a = Integer.valueOf(strs[0]);
			int b = Integer.valueOf(strs[1]);
			
			
			while(b != 0) {
				int temp = a % b;
				a = b;
				b = temp;
			}
			System.out.println(a);
		}

	}

}
