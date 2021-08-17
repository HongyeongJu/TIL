package array;

// 2차원 배열 정의하고 액세스
// => 자바에서 다차원 배열을 생성하고 참고하는 방법
public class Array2DTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] myarr = new int[3][2];
		myarr[0][0] = 100;
		myarr[1][0] = 200;
		myarr[2][0] = 300;
		
		for(int outer = 0; outer < 3; outer++) {
			for(int inner= 0; inner < 2 ; inner++) {
				System.out.println(myarr[outer][inner]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println("배열의 길이=>" + myarr.length);
		System.out.println("배열의 길이=>" + myarr[0].length);
		System.out.println("배열의 길이=>" + myarr[1].length);
		System.out.println("배열의 길이=>" + myarr[2].length);
	}

}
