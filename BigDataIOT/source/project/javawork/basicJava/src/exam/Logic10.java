package exam;

import java.util.Scanner;

public class Logic10 {

	static void printSeason(int num) {
		switch(num) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄에 태어나셨네요.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름에 태어나셨네요.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을에 태어나셨네요.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울에 태어나셨네요.");
			break;
		default : 
			System.out.println("1~12사이의 숫자만 입력하세요.");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		printSeason(num);
	}

}
