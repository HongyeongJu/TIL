package oop.inheritance;

/*
 *  << ��Ӱ��迡�� Ŭ������ ���ǵ� �޼ҵ尡 ���� Ư¡>>
 *  1. ����Ŭ������ ���ǵ� �޼ҵ带 ����Ŭ�������γ� ����Ŭ�������������� ���ؼ� ȣ���� �� �ִ�.
 *  2. ����Ŭ������ ���ǵ� �޼ҵ�� ������ �޼ҵ带 ����Ŭ�������� �����Ͽ� ȣ���ϴ� ���
 *  	����Ŭ������ �޼ҵ尡 �νĵȴ�.
 *  	=> ����Ŭ������ �޼ҵ弱��θ� ����Ŭ�������� �����ϰ� �����Ͽ� ����ϴ� ���� �޼ҵ��� �����Ƕ� �Ѵ�.
 *  		��, �޼ҵ�������̵�(overriding)�̶� �Ѵ�.
 *  			-----------------------
 *  			�޼ҵ带 �������̵��ϴ� ��� �ݵ�� �޼ҵ弱���
 */

class Parent{
	public void display() {
		System.out.println("�θ� Ŭ������ display()");
	}
}

class Child extends Parent{
	public void test() {
		System.out.println("�ڽ�Ŭ������ test()");
		display();		//1�� �׽�ũ�ڵ� - �ڱ��ڽ��� ����� ȣ���ϴ� ���� ���������� ���� ȣ������ �ʰ� �׳� �޼ҵ�� �����Ͽ� ȣ�� �� �� �ִ�.
	}
	
}

public class InheritanceTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.display();		//1�� �׽�Ʈ�ڵ�
	}

}
