package array;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		
		// 1. 3���� int �����͸� ������ �� �ִ� �迭�� ����
		// => 3���� int �� �����͸� ������ �� �ִ� ������ ���� �ִ� �迭�� �����ϴ� ���� ����
		
		int[] myarr;
		//System.out.println(myarr); => �ʱ�ȭ ���� ���� ���������� myarr�� sysout���� ����ϰ� �����Ƿ�, ��, �ʱ�ȭ ���� �ʰ� ����ϱ� ������ ��������
		
		// 2. 3���� int �� �����͸� ������ �� �մ� �迭�� ����
		myarr = new int[3];
		System.out.println("�迭�� �����ϴ� ���� =>" + myarr);
		
		// 3. �迭�� �ʱ�ȭ
		// myarr ���������� �����ϴ� �迭�� 0�� ��ҿ� ���� 100���� �ٲٱ�
		myarr[0] = 100;
		
		// myarr�� �����ϴ� �迭�l 0������� ���� �����ͼ� sysout���� ���
		//�迭�� �ʱ�ȭ���� �ʾƵ� �ʱⰪ�� �մ�.

		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		
		// 5���� int�� �����͸� ������ �� �ִ� �迭�� ����� �������ÿ�
		int[] myarr2 = new int[5];
		int myarr3[] = new int[5];
	}

}
