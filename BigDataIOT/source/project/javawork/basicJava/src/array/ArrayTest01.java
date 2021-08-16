package array;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		
		// 1. 3개의 int 데이터를 저장할 수 있는 배열을 선언
		// => 3개의 int 형 데이터를 저장할 수 있는 공간을 갖고 있는 배열을 참조하는 변수 선언
		
		int[] myarr;
		//System.out.println(myarr); => 초기화 하지 않은 지역변수인 myarr을 sysout으로 출력하고 있으므로, 즉, 초기화 하지 않고 사용하기 때문에 문법오류
		
		// 2. 3개의 int 형 데이터를 저장할 수 잇는 배열을 생성
		myarr = new int[3];
		System.out.println("배열을 참조하는 변수 =>" + myarr);
		
		// 3. 배열의 초기화
		// myarr 참조변수가 참조하는 배열의 0번 요소에 값을 100으로 바꾸기
		myarr[0] = 100;
		
		// myarr이 참조하는 배열릐 0번요소의 값을 가져와서 sysout으로 출력
		//배열은 초기화하지 않아도 초기값이 잇다.

		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		
		// 5개의 int형 데이터를 저장할 수 있는 배열의 선언과 생성동시에
		int[] myarr2 = new int[5];
		int myarr3[] = new int[5];
	}

}
