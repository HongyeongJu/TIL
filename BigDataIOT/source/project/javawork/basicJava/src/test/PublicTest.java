package test;

import oop.basic.Person;
// jvm�� ���� �۾� ���� ��Ű��(test), java.lang ��Ű���� �⺻���� �ν���.
// ���� �� ���� ��Ű���� �ۼ��� Ŭ������ ����ϱ� ���ؼ� import �ؾߵ�.
public class PublicTest {

	public static void main(String[] args) {
		Person p = new Person();
		// p.name�� public���� ���ǵǾ��� ������ �ٸ� ��Ű���� Ŭ�������� ������ ����
		// addr������ default���������� ���ǵǾ��� ������ Person Ŭ���� ���ǵ� oop.basic ��Ű���� Ŭ���������� ������ ����
		System.out.println(p.name+"," +p.addr); 
	}

}
