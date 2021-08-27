package api.lang;
// String과 StringBuffer의 성능 차이
public class StringStringBufferTest {

	//Sting으로 문자열 추가하기 기능을 수행 - + 연산자로 추가
	public static void stringCheck(int count) {
		// 시작할 때 현재 시간을 측정 -nanoTime
		String str = new String("자바");
		long start = System.nanoTime();
		
		for(int i = 1; i <= count; i++) {
			str = str + "java";
		}
		
		//작업이 종료될 떄 현재 시간을 측정
		long end =System.nanoTime();
		long time = end - start;
		System.out.println("str = str + java ");
		System.out.println("실행시간 : "+ time);
	}
	
	// StringBuffer로 문자열 추가하기 - append
	public static void stringBufferCheck(int count) {
		// 시작할 때 현재 시간을 측정 -nanoTime
		StringBuffer str = new StringBuffer("자바");
		long start = System.nanoTime();
		
		for(int i = 1; i <= count; i++) {
			str.append("java");
		}
		
		
		//작업이 종료될 떄 현재 시간을 측정
		long end =System.nanoTime();
		long time = end - start;
		System.out.println("str.append(java) ");
		System.out.println("실행시간 : "+ time);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10000;
		System.out.println("실행횟수: " +count);
		stringCheck(count);
		stringBufferCheck(count);
	}

}
