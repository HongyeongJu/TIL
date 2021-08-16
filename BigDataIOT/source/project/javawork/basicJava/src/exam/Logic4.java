package exam;

import java.util.Scanner;

public class Logic4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("암호화할 문자열: ");
		String str = scan.nextLine();
		
		System.out.print("암호화된 문자열");
		
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == ' ') System.out.print(" ");
			else {
				int num = str.charAt(i)- 'a';
				
				int index = (num + 3 ) % 26;
				
				char ch = (char)('a' + index);
				System.out.print(ch);
			}
		}

	}

}
