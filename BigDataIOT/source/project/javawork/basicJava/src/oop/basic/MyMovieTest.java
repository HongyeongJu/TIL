package oop.basic;

public class MyMovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMovie m1 = new MyMovie();
		m1.title="변호인";
		m1.genre = "드라마";
		m1.value = 9000;

		MyMovie m2 = new MyMovie();
		m2.title="겨울왕국";
		m2.genre = "애니메이션";
		m2.value = 10000;
		

		System.out.println("이름 : " + m1.title+ " 장르 : " + m1.genre + "가격 : " + m1.value);
		System.out.println("이름 : " + m2.title+ " 장르 : " + m2.genre + "가격 : " + m2.value);
	}

}
