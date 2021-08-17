package array;

// 2차원배열의 선언과 생성과 초기화를 한 번에 작업하기
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
		// 1차원배열 hapdata를 선언하고 2차원배열(data)의 각 요소에 참조하는 배열의 전체 합을 저장하고 출력하고
		
		// 0. hapdata 1차원 배열 선언하기
		int[] hapdata =new int[data.length];
		int sum = 0 ; // 2차원배열의 각 요소의 값을 저장할 변수
		for(int i = 0 ; i <data.length ; i++) {
			for(int j = 0 ; j < data[i].length; j++) {
				// 2중 for문 안에서 2차원배열의 각 요소의 합을 구한다.
				sum = sum + data[i][j];
			}
			// hap data에 1번에서 더한 결과를 저장
			hapdata[i] = sum;
		}
	}

}
