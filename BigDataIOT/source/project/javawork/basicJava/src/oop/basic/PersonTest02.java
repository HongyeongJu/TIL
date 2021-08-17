package oop.basic;

import java.util.Scanner;

public class PersonTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		System.out.println("********인사관리시스템********");
		System.out.println("1. 사원등록");
		System.out.println("2. 사원조회");
		System.out.println("3. 사원삭제");
		System.out.println("4. 사원수정");
		System.out.println("5. 사원목록조회");
		System.out.println("원하는 작업을 선택하세요.");
		
		int choiceJob= key.nextInt();
		switch(choiceJob) {
		case 1:
			System.out.println("========사원등록=========");
			System.out.print("성명:");
			String name = key.next();
			System.out.print("나이:");
			int age = key.nextInt();
			System.out.print("주소:");
			String addr = key.next();
			
			Person p = new Person();
			p.name =name;
			p.age = age;
			p.addr = addr;
			System.out.println("성명 : " + p.name);
			System.out.println("나이 : " + p.age);
			System.out.println("주소 : " + p.addr);
		case 2:
			System.out.println("==========사원조회=========");
			break;
		case 3:
			System.out.println("==========사원삭제=========");
			break;
		}

		
	}

}
