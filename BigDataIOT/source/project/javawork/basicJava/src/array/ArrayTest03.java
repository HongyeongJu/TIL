package array;

import java.util.Random;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int 형 배열 -int 값을 저장하기 위한 변수 두 개를 배열로 정의
		int[] intArr = new int[2];
		intArr[0] = 100;
		intArr[1] = 200;
		// String 형 배열 - String 변수는 원래 heap에 할당된 객체의 주소를 저장하는 변수
		// 					따라서 String 배열은 String객체를 참조하는 변수 3개를 배열로 정의
		// 					참조형배열은 참조형변수를  
		String[] strArr = new String[3];
		strArr[0] = new String("java");
		strArr[1] = new String("jsp");
		strArr[2] = new String("spring");
		
		// Random 형 배열
		Random[] ranArr = new Random[3];
		// Random 객체를 randArr의 각 요소에 할당하기
		ranArr[0] = new Random();
		ranArr[1] = new Random();
		ranArr[2] = new Random();
		System.out.println(ranArr[0]);
		System.out.println(ranArr[1]);
		System.out.println(ranArr[2]);

	}

}
