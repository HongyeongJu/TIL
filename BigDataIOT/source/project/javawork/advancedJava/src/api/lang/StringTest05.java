package api.lang;

public class StringTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = new String("java programming");
		String str2 = new String("java jdbc sevlet jsp spring");
		
		// 1. String -> byte[]
		byte[] data1 = str.getBytes();
		
		for(int i = 0 ; i < data1.length; i++) {
			System.out.println(data1[i] + "\t");
			//System.out.println(test[i] + "\t");
		}
		
		// 2. String -> char[]
		char[] data2 = str.toCharArray();
		for(int i = 0 ; i < data2.length; i++) {
			System.out.println(data2[i] + "\t");
		}
		
		// 3. String -> String[]
		// = > 특정문자로 문자열의 분리하기
		//
		// 구분문자 : spacebar, 콤마, 콜론....
		// 분리된 단어를 String배열로 관리하고 이런 단어를 token이라 한다.
		String[] data3 = str2.split(" ");
		for (int i = 0; i < data3.length; i++) {
			System.out.println(data3[i]);
		}
		
		
		//4. 기본형 -> String
		int i = 1000;
		double d = 10.5;
		test(String.valueOf(i));
		test(String.valueOf(d));
		
		test(i+"");
		test(d+"");
	}
	
	public static void test(String data) {
		System.out.println("변환된 데이터=>" +data);
	}

}
