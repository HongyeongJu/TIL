package exam;

import java.util.Scanner;

public class Logic4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȣȭ�� ���ڿ�: ");
		String str = scan.nextLine();
		
		System.out.print("��ȣȭ�� ���ڿ�");
		
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
