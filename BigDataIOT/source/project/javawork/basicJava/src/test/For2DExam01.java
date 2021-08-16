package test;

public class For2DExam01 {

	public static void main(String[] args) {
		
		int num = 1;
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0; j< 5; j++) {
				System.out.print(num++ + "\t");
			}
			System.out.println();
		}

	}

}
