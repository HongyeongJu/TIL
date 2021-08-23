package oop.inheritance;
/*
 * <<��Ӱ��迡 �ִ� Ŭ������ ������� Ư¡>>
 * 1. ��Ӱ��迡�� ����Ŭ������ ����� ��������� ����Ŭ�������� ������ �����ϴ�.
 * 2. ����Ŭ�������� ����� ������ ������ �̸��� ������ ����Ŭ������ ����Ǿ� �ִٸ� �θ�Ŭ������ ����������� ����Ŭ������ ��������� �켱������ ����.
 *    => �ڽ�Ŭ������ ��������� �ν�
 * 3. ����Ŭ�������� ����Ŭ������ ������ �̸��� ���� ����� �����ϰ� ���� ��쿡�� super��� Ű���带 �̿��ؼ� ����
 * 		this-> �ڱ� �ڽ��� ��ü
 * 		super-> �θ�ü
 */

class Super{
	int num = 100;
}

class Sub extends Super{
	int num = 1000;
	public void display() {
		System.out.println("num=>" + num);
		System.out.println("�θ�Ŭ������ num = >" +super.num);
	}
}

public class InheritaneTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ���� ���ο��� ��ü�� �����ϰ� ����ϴ� Ŭ������ ������ ����Ŭ�����̴�.
		Sub obj = new Sub();
		obj.display();
		System.out.println(obj.num);
	}

}
