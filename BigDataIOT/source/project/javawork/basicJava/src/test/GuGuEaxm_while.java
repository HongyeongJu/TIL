package test;

import java.util.Scanner;

public class GuGuEaxm_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ��: ");
		int dan = scan.nextInt();
		int i = 1;
		while(i <= 9) {
			System.out.println(dan + "*" + i + "=" +(i *dan));
			i++;
		}
		
		
	}

}
