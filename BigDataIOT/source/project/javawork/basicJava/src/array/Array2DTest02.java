package array;

// 2�����迭�� ����� ������ �ʱ�ȭ�� �� ���� �۾��ϱ�
public class Array2DTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] data = {
				{97,88,77,66,88},
				{100,88,95,66,77},
				{95,99,77,66,56},
				{89,98,77,66,100}
		};
		
		int[][] data2 = new int[][] {
			{97,88,77,66,88},
			{100,88,95,66,77},
			{95,99,77,66,56},
			{89,98,77,66,100}
		};
		// 1�����迭 hapdata�� �����ϰ� 2�����迭(data)�� �� ��ҿ� �����ϴ� �迭�� ��ü ���� �����ϰ� ����ϰ�
		
		// 0. hapdata 1���� �迭 �����ϱ�
		int[] hapdata =new int[data.length];
		int sum = 0 ; // 2�����迭�� �� ����� ���� ������ ����
		for(int i = 0 ; i <data.length ; i++) {
			for(int j = 0 ; j < data[i].length; j++) {
				// 2�� for�� �ȿ��� 2�����迭�� �� ����� ���� ���Ѵ�.
				sum = sum + data[i][j];
			}
			// hap data�� 1������ ���� ����� ����
			hapdata[i] = sum;
		}
	}

}
