package test;

public class For2DExam02 {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		for(int i = 0 ; i < 5; i++) {
			for(int j = 0 ; j < 5; j++) {
				if(i == j) {
					System.out.print("*\t" );
				}else {
					System.out.print(ch +  "\t");
				}
				ch++;
			}
			System.out.println();
		}

	}

}
