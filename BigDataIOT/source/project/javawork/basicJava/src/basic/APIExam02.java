package basic;

import java.util.Random;

public class APIExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		System.out.println("������: " + rand.nextInt());
		
		// 1���� 100���� �������� ���
		
		System.out.println("������ : " + (rand.nextInt(100) +1));
	}

}
