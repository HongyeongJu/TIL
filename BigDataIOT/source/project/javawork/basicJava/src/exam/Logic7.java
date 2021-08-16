package exam;

public class Logic7 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		for(int i = 1; i <=15 ; i++) {
			sum += num;
			for(int j = 1 ; j<= i; j++) {
				num += 1;
			}
		}
		
		System.out.println(sum);
		
	}

}
