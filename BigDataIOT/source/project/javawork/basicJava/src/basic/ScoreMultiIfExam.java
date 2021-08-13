package basic;

import java.util.Scanner;

public class ScoreMultiIfExam {

	public static void main(String[] args) {
		//다중if, if문을 중첩
		
		Scanner scan = new Scanner(System.in);
		System.out.print("점수:");
		int score = scan.nextInt();
		
		if(0<= score && score <=59) {
			System.out.println("F학점");
		}else if(60<= score && score <=69) {
			System.out.println("D학점");
		}else if(70<= score && score <=79) {
			System.out.println("C학점");
		}else if(80<= score && score <=89) {
			System.out.println("B학점");
		}else if(90<= score && score <=100) {
			System.out.println("A학점");
		}else {
			System.out.println("잘못입력");
		}
	}

}
