package exam;

public class Array2DExam01 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		
		for(int i = 0 ; i <5 ; i++) {
			for(int j = 0 ; j < 5; j++) {
				array[i][j] = i* 5 + j + 1;
			}
		}

		
		for(int i = 0 ; i < array.length;i++) {
			for(int j = 0 ; j <array[i].length ;j++) {
				System.out.print(array[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
