package exception;

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("start");
		System.out.println("���ڸ� �Է��ϼ���");
		int num = key.nextInt();
		System.out.println("���� ���ڸ� �Է��ϼ���");
		int num2 = key.nextInt();
		System.out.println("���: " + (num / num2));
		System.out.println("�ٸ� �۾��� ó��");
		System.out.println("end");
	}

}
