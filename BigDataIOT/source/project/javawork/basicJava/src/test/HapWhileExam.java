package test;

public class HapWhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		int i = 1;
		
		while(i <= 100) {
			if(i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
			i++;
		}
		
		sum = evenSum + oddSum;

		System.out.println("����: " + sum);
		System.out.println("¦����: " + evenSum);
		System.out.println("Ȧ����: " + oddSum);

	}

}
