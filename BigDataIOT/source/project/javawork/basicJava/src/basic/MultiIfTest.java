package basic;

import java.util.Scanner;

public class MultiIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է�:");
		int ssn = key.nextInt();
		System.out.println(ssn);
		if(ssn == 1 | ssn ==3) {
			System.out.println("����");
		}else if(ssn == 2 | ssn ==4) {
			System.out.println("����");
		}else {
			System.out.println("��Ÿ");
		}
	}

}
