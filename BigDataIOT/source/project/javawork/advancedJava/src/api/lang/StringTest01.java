package api.lang;

//String을 정의하는 방법
//- 리터럴(literal)
// - 객체 생성
public class StringTest01 {

	public static void main(String[] args) {
		// String을 리터럴의 형식으로 할당하면 heap의 String 상수 pool에 저장
		String str1 ="java";
		String str2 = "java";
		
		//객체생성으로 할당 - 인스턴스만들기
		String str3 =new String("java");
		String str4 = new String("java");
		
		if(str1 == str2) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(str1 == str3) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(str3 == str4) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
		
		if(str1.equals(str4)) {
			System.out.println("같다.");
		}else {
			System.out.println("다르다.");
		}
	}
}
