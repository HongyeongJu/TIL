package statement;

public class ForExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int odd = 0;
		int even = 0;
		for(int i = 1; i <= 100; i++) {
			if(i %2 == 0) {
				even += i;
			}else {
				odd += i;
			}
		}
		sum = even + odd;

		System.out.println("���� " + sum);
		System.out.println("¦���� " + even);
		System.out.println("Ȧ���� " + odd);

	}

}
