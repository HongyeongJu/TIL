package basic;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. �����ڵ� - 1~4����
		// 2. ���� -1~100����
		// ������ ���̸� ������ �Ǵ��ؼ� ����� ����ϱ�
		/*
		 * Random ran = new Random(); int gender_code = ran.nextInt(4) +1;
		 * 
		 * int age = ran.nextInt(100) + 1;
		 */
		Scanner scan = new Scanner(System.in);
		int gender_code = scan.nextInt();
		int age = scan.nextInt();
		
		if(gender_code == 1 || gender_code == 3) {
			if(age >= 20) {
				System.out.println("���γ���(" + age + "," + gender_code +")");
			}else {
				System.out.println("û�ҳⳲ��(" + age + "," + gender_code +")");
			}
		}else if(gender_code == 2 || gender_code == 4) {
			if(age >= 20) {
				System.out.println("���ο���(" + age + "," + gender_code +")");
			}else {
				System.out.println("û�ҳ⿩��(" + age + "," + gender_code +")");
			}
		}
	}

}
