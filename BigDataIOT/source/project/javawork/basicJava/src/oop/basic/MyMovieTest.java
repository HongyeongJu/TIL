package oop.basic;

public class MyMovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMovie m1 = new MyMovie();
		m1.title="��ȣ��";
		m1.genre = "���";
		m1.value = 9000;

		MyMovie m2 = new MyMovie();
		m2.title="�ܿ�ձ�";
		m2.genre = "�ִϸ��̼�";
		m2.value = 10000;
		

		System.out.println("�̸� : " + m1.title+ " �帣 : " + m1.genre + "���� : " + m1.value);
		System.out.println("�̸� : " + m2.title+ " �帣 : " + m2.genre + "���� : " + m2.value);
	}

}
