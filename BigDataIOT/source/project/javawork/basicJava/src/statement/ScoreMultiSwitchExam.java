package statement;

import java.util.Scanner;

public class ScoreMultiSwitchExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("����:");
		int score = scan.nextInt();
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A����");
			break;
		case 8:
			System.out.println("B����");
			break;
		case 7:
			System.out.println("C����");
			break;
		case 6:
			System.out.println("D����");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("F����");
			break;
		default :
			System.out.println("�߸��Է�");
			break;
		}
		/*
		if(0<= score && score <=59) {
			System.out.println("F����");
		}else if(60<= score && score <=69) {
			System.out.println("D����");
		}else if(70<= score && score <=79) {
			System.out.println("C����");
		}else if(80<= score && score <=89) {
			System.out.println("B����");
		}else if(90<= score && score <=100) {
			System.out.println("A����");
		}else {
			System.out.println("�߸��Է�");
		}
		*/
		
	}

}
