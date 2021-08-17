package oop.basic;

import java.util.Scanner;

public class MyMovieTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		System.out.println("1. 영화 등록");
		
		System.out.print("원하는 작업을 선택하세요: ");
		int choice = key.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("이름 : ");
			String name = key.next();

			System.out.print("장르 : ");
			String genre = key.next();

			System.out.print("가격 : ");
			int value = key.nextInt();
			
			MyMovie m = new MyMovie();
			m.title = name;
			m.genre = genre;
			m.value = value;

			System.out.println("제목 : " + m.title);
			System.out.println("장르 : " + m.genre);
			System.out.println("가격 : " + m.value);
		}
	
	}

}
