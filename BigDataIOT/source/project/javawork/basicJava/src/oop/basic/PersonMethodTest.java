package oop.basic;

public class PersonMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonMethod p1 = new PersonMethod();
		p1.setName("�嵿��");
		p1.setAge(40);
		p1.setAddr("�����");
		System.out.println("���� : " + p1.getName() + "���� :"  + p1.getAge() + ", �ּ� : " +p1.getAddr());
		System.out.println("Person��ü�� �Ҵ�� heap�� �ּ�"+ p1);
		
		PersonMethod p2 = new PersonMethod();
		p2.setName("�輭��");
		p2.setAge(25);
		p2.setAddr("��õ��");
		System.out.println("���� : " + p2.getName() + "���� :"  +p2.getAge() + ", �ּ� : " +p2.getAddr());
		System.out.println("Person��ü�� �Ҵ�� heap�� �ּ�"+ p2);	
		

	}

}
