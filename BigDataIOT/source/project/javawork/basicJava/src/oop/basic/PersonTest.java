package oop.basic;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		// private ����� �ܺο��� ������ �Ұ���
		p1.name = "�嵿��";
		p1.age = 40;
		p1.addr = "�����";
		System.out.println("���� : " + p1.name + "���� :"  +p1.age + ", �ּ� : " +p1.addr);
		System.out.println("Person��ü�� �Ҵ�� heap�� �ּ�"+ p1);
		
		Person p2 = new Person();
		p2.name = "�輭��";
		p2.age = 25;
		p2.addr = "��õ��";
		System.out.println("���� : " + p2.name + "���� :"  +p2.age + ", �ּ� : " +p2.addr);
		System.out.println("Person��ü�� �Ҵ�� heap�� �ּ�"+ p2);	
		

	}

}
