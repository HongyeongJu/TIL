package array;

import java.util.Random;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int �� �迭 -int ���� �����ϱ� ���� ���� �� ���� �迭�� ����
		int[] intArr = new int[2];
		intArr[0] = 100;
		intArr[1] = 200;
		// String �� �迭 - String ������ ���� heap�� �Ҵ�� ��ü�� �ּҸ� �����ϴ� ����
		// 					���� String �迭�� String��ü�� �����ϴ� ���� 3���� �迭�� ����
		// 					�������迭�� ������������  
		String[] strArr = new String[3];
		strArr[0] = new String("java");
		strArr[1] = new String("jsp");
		strArr[2] = new String("spring");
		
		// Random �� �迭
		Random[] ranArr = new Random[3];
		// Random ��ü�� randArr�� �� ��ҿ� �Ҵ��ϱ�
		ranArr[0] = new Random();
		ranArr[1] = new Random();
		ranArr[2] = new Random();
		System.out.println(ranArr[0]);
		System.out.println(ranArr[1]);
		System.out.println(ranArr[2]);

	}

}
