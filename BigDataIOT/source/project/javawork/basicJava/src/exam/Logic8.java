package exam;

import java.util.Scanner;

public class Logic8 {

	public static String leftPad(String str, int size, char padChar) {
		String anw= "";
		
		if(str.length() >= size) {
			anw = str;
		}else {
			int count = size - str.length();
			for(int i = 0 ; i < count ; i++) {
				anw += padChar;
			}
			
			anw += str;
		}
		
		return anw;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int num = scan.nextInt();
		char ch = scan.next().charAt(0);
		
		System.out.println(leftPad(str, num, ch));
	}

}
