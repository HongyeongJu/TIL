package oop.basic;

import java.util.Scanner;

public class MyMovieTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		System.out.println("1. ��ȭ ���");
		
		System.out.print("���ϴ� �۾��� �����ϼ���: ");
		int choice = key.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("�̸� : ");
			String name = key.next();

			System.out.print("�帣 : ");
			String genre = key.next();

			System.out.print("���� : ");
			int value = key.nextInt();
			
			MyMovie m = new MyMovie();
			m.title = name;
			m.genre = genre;
			m.value = value;

			System.out.println("���� : " + m.title);
			System.out.println("�帣 : " + m.genre);
			System.out.println("���� : " + m.value);
		}
	
	}

}
