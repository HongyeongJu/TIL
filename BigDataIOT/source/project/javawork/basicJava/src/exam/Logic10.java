package exam;

import java.util.Scanner;

public class Logic10 {

	static void printSeason(int num) {
		switch(num) {
		case 3:
		case 4:
		case 5:
			System.out.println("���� �¾�̳׿�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ �¾�̳׿�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("������ �¾�̳׿�.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ￡ �¾�̳׿�.");
			break;
		default : 
			System.out.println("1~12������ ���ڸ� �Է��ϼ���.");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		printSeason(num);
	}

}
