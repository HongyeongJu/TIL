// 패키지는 한번만써야됨.
package basic;

import java.io.File;
import java.util.Random;
import java.util.Vector;

// APIExam01클래스 내부에서 사용하는 API의 클래스를 java.util 패키지에서도 찾을 수 있도록 설정
// import 는 여러개 사용할 수있다.
/*import java.util.*;
import java.util.Random;
import java.io.File;*/
// 정확하게 사용하는 import로 사용하라.(권고사항)
public class APIExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. "I like java"문자열을 아래 조건에 맞게 처리할 수 잇도록 String 클래스를 만들어서 작업합니다.
		
		String str = new String("I like java");
		System.out.println("문자열의 길이 : " + str.length());
		
		
		//JVM이 기본으로 인식하는 API의 위치는 java/lang패키지와 현재 소스파일을 작업하는 위치(basic)
		new Random();
		new File("");
		new Vector();
	}

}
