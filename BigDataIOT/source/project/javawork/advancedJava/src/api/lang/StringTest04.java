package api.lang;

public class StringTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("java programming");
		String str2 = new String("재밌다");

		// 5번 index부터 전부
		System.out.println("str1.substring(5)=>" +str1.substring(5));
		// 5번 ~7번 까지 추출
		System.out.println("str1.substring(5, 8)=>" +str1.substring(5, 8));
		System.out.println("str1.replace('a', 'A')=>" +str1.replace('a', 'A'));
		System.out.println("문자열원본=>" +str1);
	}

}
