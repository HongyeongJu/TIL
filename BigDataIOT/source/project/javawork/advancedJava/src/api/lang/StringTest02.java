package api.lang;

//String의 생성자 확인
public class StringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] data = {65,66,67,68,69,70};
		char[] data2 = new char[] {'0','1','0', '-', '7','7','7','7','-'};
		
		//String클래스를 사용하는 경우 다양한 타입의 입력데이터를 문자열로 만들기 위해서 생성할 떄 초기화할 수 있도록 다양한 타입의
		//생성자가 오버로딩되어 있다.
		String str = new String("java");
		String str1= new String(data);
		String str2 = new String(data2);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2.toString());  //toString()호출이 생략
	}

}
