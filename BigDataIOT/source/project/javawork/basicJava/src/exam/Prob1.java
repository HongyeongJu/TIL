package exam;

public class Prob1 {

	public static void main(String[] args) {
		int count = 0;
		int number = 0;
		
		for(int i = 1; i <=100; i++) {
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) count++;
				
				if(count >2) break;
			}
			
			if(count == 2) {
				System.out.println(i + "은 소수이다.");
				number++;
			}
			count = 0;
		}

		System.out.println("소수의 개수 =>"+ number);
	}

}
