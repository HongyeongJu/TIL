package basic;

import java.util.Scanner;

public class ScoreMultiIfExam {

	public static void main(String[] args) {
		//����if, if���� ��ø
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����:");
		int score = scan.nextInt();
		
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
	}

}
